package com.ianmcshoe.taskmaster.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ianmcshoe.taskmaster.R;
import com.ianmcshoe.taskmaster.activities.MainActivity;
import com.ianmcshoe.taskmaster.models.TaskList;

import java.util.List;

public class TaskListRecyclerViewAdapter extends RecyclerView.Adapter<TaskListRecyclerViewAdapter.TaskListViewHolder> {
    List<TaskList> taskList;
    Context callingActivity;

    public TaskListRecyclerViewAdapter(List<TaskList> taskList, Context callingActivity) {
        this.taskList = taskList;
        this.callingActivity = callingActivity;
    }

    @NonNull
    @Override
    public TaskListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View taskFrag = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_task_list, parent, false);
        return new TaskListViewHolder(taskFrag);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskListViewHolder holder, int position) {
        TextView taskListFragTextViewName = holder.itemView.findViewById(R.id.TaskListName);
        String taskListName = taskList.get(position).getName();
        taskListFragTextViewName.setText(position + ". " + taskListName);
    }

    @Override
    public int getItemCount() {
        return taskList.size();
    }

    public static class TaskListViewHolder extends RecyclerView.ViewHolder {

        public TaskListViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}