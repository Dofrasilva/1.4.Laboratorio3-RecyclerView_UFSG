package com.ejemplo.recyclerviewcv1;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

/**
 * Crear dos clases que extienden:
 *      RecyclerView.Adapter
 *      RecyclerView.ViewHolder
 */

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder>{

    private Context mCtx;
    private List<DataProvider> productList;

    public ProductAdapter(Context mCtx, List<DataProvider> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.card_layout,null);

        ProductViewHolder holder = new ProductViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        DataProvider product = productList.get(position);

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));
        holder.textViewTitle.setText(product.getTitle());
        holder.textViewDesc.setText(product.getShortdesc());
        holder.textViewRating.setText(String.valueOf(product.getRating()));







    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textViewTitle,textViewDesc,textViewRating;

        public ProductViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textView1);
            textViewDesc = itemView.findViewById(R.id.textView2);
            textViewRating = itemView.findViewById(R.id.textView3);



        }
    }



}
