package semana1.curso3.coursera.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import semana1.curso3.coursera.R;
import semana1.curso3.coursera.pojo.Pet;

public class PetProfileAdapter extends RecyclerView.Adapter<PetProfileAdapter.PetViewHolder> {

    private Activity activity;
    private ArrayList<Pet> pets;

    public PetProfileAdapter(Activity activity, ArrayList<Pet> pets) {
        this.activity = activity;
        this.pets = pets;
    }

    @Override
    public PetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_pet_profile, parent, false);
        return new PetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final PetViewHolder petViewHolder, int position) {
        final Pet pet = pets.get(position);
        petViewHolder.iv_photo.setImageResource(pet.getPhoto());
        petViewHolder.tv_rating.setText(String.valueOf(pet.getRating()));
    }

    @Override
    public int getItemCount() {
        return pets.size();
    }

    static class PetViewHolder extends RecyclerView.ViewHolder {

        private ImageView iv_photo;
        private TextView tv_rating;

        PetViewHolder(View view) {
            super(view);
            iv_photo = (ImageView) view.findViewById(R.id.iv_photo);
            tv_rating = (TextView) view.findViewById(R.id.tv_rating);
        }

    }

}