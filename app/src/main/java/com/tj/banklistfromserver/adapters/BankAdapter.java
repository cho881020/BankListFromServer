package com.tj.banklistfromserver.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.tj.banklistfromserver.R;
import com.tj.banklistfromserver.datas.Bank;

import java.util.List;

public class BankAdapter extends ArrayAdapter<Bank> {

    Context mContext;
    List<Bank> mList;
    LayoutInflater inf;

    public BankAdapter(Context context, List<Bank> list) {
        super(context, R.layout.bank_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            row = inf.inflate(R.layout.bank_list_item, null);
        }

        Bank bankData = mList.get(position);

        ImageView logoImg = row.findViewById(R.id.logoImg);
        TextView bankNameTxt = row.findViewById(R.id.bankNameTxt);
        TextView bankCodeTxt = row.findViewById(R.id.bankCodeTxt);

        bankNameTxt.setText(bankData.name);
        bankCodeTxt.setText(String.format("(%s)", bankData.code));

        Glide.with(mContext).load(bankData.logo).into(logoImg);

        return row;
    }
}
