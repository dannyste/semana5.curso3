package semana1.curso3.coursera.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import semana1.curso3.coursera.R;
import semana1.curso3.coursera.adapter.PetProfileAdapter;
import semana1.curso3.coursera.pojo.Pet;

/**
 * A simple {@link Fragment} subclass.
 */
public class PetProfileFragment extends Fragment {

    private RecyclerView rv_pet_profile;

    private ArrayList<Pet> pets;
    private PetProfileAdapter petProfileAdapter;

    public PetProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pet_profile, container, false);
        rv_pet_profile = (RecyclerView) view.findViewById(R.id.rv_pet_profile);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 3);
        rv_pet_profile.setLayoutManager(gridLayoutManager);
        pets = new ArrayList<Pet>();
        pets.add(new Pet(R.drawable.pet_four, 4));
        pets.add(new Pet(R.drawable.pet_four, 0));
        pets.add(new Pet(R.drawable.pet_four, 2));
        pets.add(new Pet(R.drawable.pet_four, 3));
        pets.add(new Pet(R.drawable.pet_four, 2));
        pets.add(new Pet(R.drawable.pet_four, 6));
        pets.add(new Pet(R.drawable.pet_four, 4));
        pets.add(new Pet(R.drawable.pet_four, 5));
        pets.add(new Pet(R.drawable.pet_four, 3));
        pets.add(new Pet(R.drawable.pet_four, 0));
        pets.add(new Pet(R.drawable.pet_four, 2));
        pets.add(new Pet(R.drawable.pet_four, 3));
        pets.add(new Pet(R.drawable.pet_four, 2));
        pets.add(new Pet(R.drawable.pet_four, 6));
        petProfileAdapter = new PetProfileAdapter(getActivity(), pets);
        rv_pet_profile.setAdapter(petProfileAdapter);
        return view;
    }

}
