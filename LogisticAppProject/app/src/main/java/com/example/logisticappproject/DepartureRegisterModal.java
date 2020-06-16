package com.example.logisticappproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class DepartureRegisterModal extends BottomSheetDialogFragment {
    private ActionListener mActionListener;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.modal_departure_register, container, false);

        Button btnA = v.findViewById(R.id.btn_accept);
        Button btnB = v.findViewById(R.id.btn_cancel);

        btnA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(mActionListener != null)
                    mActionListener.onButtonClick(R.id.btn_accept);
                dismiss();
            }
        });
        btnB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(mActionListener!=null)
                    mActionListener.onButtonClick(R.id.btn_cancel);
                dismiss();
            }
        });

        return v;
    }

    public void setmActionListener(ActionListener mActionListener) {
        this.mActionListener = mActionListener;
    }

    interface ActionListener{
        void onButtonClick(int id);
    }
}
