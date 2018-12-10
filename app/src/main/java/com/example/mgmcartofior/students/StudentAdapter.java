package com.example.mgmcartofior.students;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentsHolder> {
    private List<Students> students;

    public StudentAdapter(List<Students> students) {
        this.students = students;
    }

    @NonNull
    @Override
    public StudentsHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View studentsView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.students_view, viewGroup, false);

        return new StudentsHolder(studentsView);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentsHolder studentsHolder, int i) {
        Students students1 = students.get(i);
        studentsHolder.getmFirstName().setText(students1.getmFirstName());
        studentsHolder.getmSecondName().setText(students1.getmLastName());
    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}
