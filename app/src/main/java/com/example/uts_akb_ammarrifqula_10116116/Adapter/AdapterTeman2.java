package com.example.uts_akb_ammarrifqula_10116116.Adapter;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;



import com.example.uts_akb_ammarrifqula_10116116.R;
import com.example.uts_akb_ammarrifqula_10116116.Model.ModelTeman;
import java.util.ArrayList;

public class AdapterTeman2 extends RecyclerView.Adapter<AdapterTeman2.MahasiswaViewHolder> {


    private ArrayList<ModelTeman> dataList;

    public AdapterTeman2(ArrayList<ModelTeman> dataList) {

        this.dataList = dataList;

    }


    @NonNull
    @Override

    public MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View view = layoutInflater.inflate(R.layout.row, parent, false);

        return new MahasiswaViewHolder(view);

    }



    @Override

    public void onBindViewHolder(@NonNull MahasiswaViewHolder holder, int position) {

        holder.txtNama.setText(dataList.get(position).getNama());

        holder.txtNim.setText(dataList.get(position).getNim());

        holder.txtKelas.setText(dataList.get(position).getKelas());

        holder.txtTelp.setText(dataList.get(position).getTelepon());

        holder.txtEmail.setText(dataList.get(position).getEmail());

        holder.txtSocmed.setText(dataList.get(position).getSocialmedia());

    }



    @Override

    public int getItemCount() {

        return (dataList != null) ? dataList.size() : 0;

    }



    class MahasiswaViewHolder extends RecyclerView.ViewHolder{

        private TextView txtNama, txtNim, txtKelas,txtTelp,txtEmail,txtSocmed;



        MahasiswaViewHolder(View itemView) {

            super(itemView);

            txtNama = itemView.findViewById(R.id.txt_nama);

            txtNim = itemView.findViewById(R.id.txt_nim);

            txtKelas = itemView.findViewById(R.id.txt_kelas);

            txtTelp = itemView.findViewById(R.id.txt_telp);

            txtEmail = itemView.findViewById(R.id.txt_email);

            txtSocmed = itemView.findViewById(R.id.txt_socmed);

        }

    }

}
