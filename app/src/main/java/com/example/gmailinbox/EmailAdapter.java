package com.example.gmailinbox;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EmailAdapter extends RecyclerView.Adapter<EmailAdapter.EmailViewHolder> {

    private List<Email> emailList;

    public EmailAdapter(List<Email> emailList) {
        this.emailList = emailList;
    }

    @NonNull
    @Override
    public EmailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.email_items, parent, false);
        return new EmailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmailViewHolder holder, int position) {
        Email email = emailList.get(position);
        holder.senderNameTextView.setText(email.getSenderName());
        holder.subjectTextView.setText(email.getSubject());
        holder.previewTextView.setText(email.getPreview());
        holder.timestampTextView.setText(email.getTimestamp());
    }

    @Override
    public int getItemCount() {
        return emailList.size();
    }

    public static class EmailViewHolder extends RecyclerView.ViewHolder {
        TextView senderNameTextView;
        TextView subjectTextView;
        TextView previewTextView;
        TextView timestampTextView;

        public EmailViewHolder(@NonNull View itemView) {
            super(itemView);
            senderNameTextView = itemView.findViewById(R.id.senderName);
            subjectTextView = itemView.findViewById(R.id.subject);
            previewTextView = itemView.findViewById(R.id.preview);
            timestampTextView = itemView.findViewById(R.id.timestamp);
        }
    }
}