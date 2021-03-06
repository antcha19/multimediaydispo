package com.example.fragmento;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CountFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CountFragment extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    //declaracion mia
    private Button boton;
    private EditText edit;
    private TextView text;


    public CountFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CountFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CountFragment newInstance(String param1, String param2) {
        CountFragment fragment = new CountFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_count, container, false);

        //Nuevos parametros para el view del fragmento
        RelativeLayout.LayoutParams params =    new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);
        //Nueva Regla: EL fragmento estara debajo del ID del contenedor
        params.addRule(RelativeLayout.BELOW, R.id.contenedor);
        //Margenes: top:41dp
        params.setMargins(0,41,0,0);
        //Setear los parametros al view
        view.setLayoutParams(params);


        boton = (Button)view.findViewById(R.id.main_button);
        edit = (EditText)view.findViewById(R.id.main_editText);
        text = (TextView)view.findViewById(R.id.main_textview);


        boton.setOnClickListener( new View.OnClickListener() {

            public void onClick(View view){

                String mensaje = edit.getText().toString();
                text.setText(String.valueOf(mensaje.length()));

            }

        });

        return view;
    }
}