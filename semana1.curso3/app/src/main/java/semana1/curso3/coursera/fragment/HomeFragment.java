package semana1.curso3.coursera.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import semana1.curso3.coursera.R;
import semana1.curso3.coursera.adapter.PetAdapter;
import semana1.curso3.coursera.pojo.Pet;
import semana1.curso3.coursera.pojo.PetConstructor;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private RecyclerView rv_pet;

    private ArrayList<Pet> pets;
    private PetAdapter petAdapter;

    private PetConstructor petConstructor;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        rv_pet = (RecyclerView) view.findViewById(R.id.rv_pet);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rv_pet.setLayoutManager(linearLayoutManager);
        petConstructor = new PetConstructor(getActivity());
        pets = petConstructor.getPets();
        petAdapter = new PetAdapter(getActivity(), pets);
        rv_pet.setAdapter(petAdapter);
        return view;
    }

}