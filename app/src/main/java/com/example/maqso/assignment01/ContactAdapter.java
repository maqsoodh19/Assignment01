package com.example.maqso.assignment01;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by maqso on 10/2/2017.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {

    ArrayList<Contacts> list;
    Context context;

    public ContactAdapter(Context context, ArrayList<Contacts> list) {
        this.list = list;
        this.context = context;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        final Contacts item = list.get(position);

        holder.name.setText(item.getName());
        holder.phone.setText("" + item.getPhoneNO());
        holder.btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                String p = "tel:" + item.getPhoneNO();
                intent.setData(Uri.parse(p));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {
        TextView name, phone;
        Button btnCall;

        public ContactViewHolder(View view) {

            super(view);

            name = (TextView) view.findViewById(R.id.name);
            phone = (TextView) view.findViewById(R.id.contactno);
            btnCall = (Button) view.findViewById(R.id.btncall);
        }

    }
}