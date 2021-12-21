package com.example.indonesiastruktur;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListKabFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListKabFragment extends ListFragment {

    private Listener listener;
    private long propId;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ListKabFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ListKabFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ListKabFragment newInstance(String param1, String param2) {
        ListKabFragment fragment = new ListKabFragment();
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
//        System.out.println("Mengisi list berdasarkan prop id " +propId);
//        String[] names = new String[Propinsi.propinsis[(int)propId].getKabupatens().length];
//        for (int i = 0; i < names.length; i++) {
//            names[i] = Propinsi.propinsis[(int)propId].getKabupatens()[i].getName();
//        }
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(
//                inflater.getContext(), android.R.layout.simple_list_item_1,
//                names);
//        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    //    @Override
    public void onStart() {
        super.onStart();
        System.out.println("Mengisi list berdasarkan prop id " +propId);
        String[] names = new String[Provinsi.provinsis[(int)propId].getKabupatens().length];
        for (int i = 0; i < names.length; i++) {
            names[i] = Provinsi.provinsis[(int)propId].getKabupatens()[i].getName();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                super.getLayoutInflater().getContext(), android.R.layout.simple_list_item_1,
                names);
        setListAdapter(adapter);
    }

    public void setPropId(long id) {
        this.propId = id;
        System.out.println("Terima prop id dari activity"+id);
    }
    public long getPropId() {
        return propId;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (Listener)context;
    }
    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id) {
        if (listener != null) {
            listener.itemClicked(id);
        }
    }
}