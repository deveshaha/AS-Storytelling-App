package com.dam.microcuentos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dam.microcuentos.model.Cuento;

import java.util.ArrayList;

public class CuentoAdapter extends RecyclerView.Adapter<CuentoAdapter.CuentoVH> implements View.OnClickListener {

    private ArrayList<Cuento> cuentos;
    private View.OnClickListener listener;

    public CuentoAdapter(ArrayList<Cuento> cuentos) {
        this.cuentos = cuentos;
    }

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public CuentoVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cuento_item, parent, false);
        v.setOnClickListener(this);
        return new CuentoVH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CuentoVH holder, int position) {
        holder.bindCuento(cuentos.get(position));
    }

    @Override
    public int getItemCount() {
        return cuentos.size();
    }

    @Override
    public void onClick(View view) {
        if (listener != null){
            listener.onClick(view);
        }
    }

    public static class CuentoVH extends RecyclerView.ViewHolder{

        private TextView titulo;
        private TextView avance;

        public CuentoVH(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.tv_titulo);
            avance = itemView.findViewById(R.id.tv_avance);
        }

        public void bindCuento(Cuento cuento){
            titulo.setText(cuento.getTitulo());
            avance.setText(cuento.getAvance());
        }
    }

}
