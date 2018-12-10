package com.example.mgmcartofior.students;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class StudentsHolder extends RecyclerView.ViewHolder {
    private TextView mFirstName;
    private TextView mSecondName;

    public StudentsHolder(@NonNull View itemView) {
        super(itemView);
        mFirstName = itemView.findViewById(R.id.first_name);
        mSecondName = itemView.findViewById(R.id.second_name);
    }

    public TextView getmFirstName() {
        return mFirstName;
    }

    public void setmFirstName(TextView mFirstName) {
        this.mFirstName = mFirstName;
    }

    public TextView getmSecondName() {
        return mSecondName;
    }

    public void setmSecondName(TextView mSecondName) {
        this.mSecondName = mSecondName;
    }
}
