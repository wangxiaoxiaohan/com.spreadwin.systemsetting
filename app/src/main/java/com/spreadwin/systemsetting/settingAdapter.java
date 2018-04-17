package com.spreadwin.systemsetting;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by hs-acer on 2018/4/17.
 */

public class settingAdapter  extends  RecyclerView.Adapter<settingAdapter.ViewHolder> {
    private  Boolean isTouch=true;
    private Context mContext;
    private LayoutInflater mInflater;

    public  settingAdapter(Context context){
           this.mContext=context;
           mInflater=LayoutInflater.from(context);

    }
     public  static  class  ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView ;
        RelativeLayout relativeLayout;
        public  ViewHolder(View itemView){
          super(itemView);

        }

     }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=mInflater.inflate(R.layout.item,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        viewHolder.imageView=view.findViewById(R.id.image);
        viewHolder.textView=view.findViewById(R.id.text);
        viewHolder.relativeLayout=view.findViewById(R.id.rl_item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final  settingAdapter.ViewHolder holder, final int position) {
          filldata(holder,position);
    }

    @Override
    public int getItemCount() {
        return 12;
    }
    private void  filldata(final settingAdapter.ViewHolder holder, int position){
          switch (position ){
              case 0:
                  holder.imageView.setImageResource(R.drawable.ic_wifi_normal);
                  holder.textView.setText("WIFI设置");
                     registerListener(holder,position);

                  break;
              case 1:
                  holder.imageView.setImageResource(R.drawable.ic_wlan_hot_normal);
                  holder.textView.setText("WIFI热点");
                  registerListener(holder,position);
                  break;
              case 2:
                  holder.imageView.setImageResource(R.drawable.ic_mobile_network_normal);
                  holder.textView.setText("移动网络");
                  registerListener(holder,position);
                  break;
              case 3:
                  holder.imageView.setImageResource(R.drawable.ic_application_settings_normal);
                  holder.textView.setText("应用设置");
                  registerListener(holder,position);
                  break;
              case 4:
                  holder.imageView.setImageResource(R.drawable.ic_adjust_settings_normal);
                  holder.textView.setText("调节设置");
                  registerListener(holder,position);
                  break;
              case 5:
                  holder.imageView.setImageResource(R.drawable.ic_storage_capacity_normal);
                  holder.textView.setText("存储容量");
                  registerListener(holder,position);
                  break;
              case 6:
                  holder.imageView.setImageResource(R.drawable.ic_about_equipment_normal);
                  holder.textView.setText("关于设备");
                  registerListener(holder,position);
                  break;
              case 7:
                  holder.imageView.setImageResource(R.drawable.ic_push_setting_normal);
                  holder.textView.setText("推送设置");
                  registerListener(holder,position);
                  break;
              case 8:holder.imageView.setImageResource(R.drawable.ic_bluetooth_settings_normal);
                  holder.textView.setText("蓝牙设置");
                  registerListener(holder,position);
                  break;
              case 9:
                  holder.imageView.setImageResource(R.drawable.ic_backup_reset_normal);
                  holder.textView.setText("备份和重置");
                  registerListener(holder,position);
                  break;
              case 10:
                  holder.imageView.setImageResource(R.drawable.ic_system_switching_normal);
                  holder.textView.setText("系统切换");
                  registerListener(holder,position);
                  break;
              case 11 :
                  holder.imageView.setImageResource(R.drawable.ic_bt_volume_normal);
                  holder.textView.setText("音效设置");
                  registerListener(holder,position);
                  break;
          }
    }
     private  void  registerListener(final settingAdapter.ViewHolder holder, final int position){
         holder.relativeLayout.setOnTouchListener(new View.OnTouchListener() {
             @Override
             public boolean onTouch(View v, MotionEvent event) {
                 switch (position){
                     case 0:
                         if (event.getAction()==MotionEvent.ACTION_DOWN || event.getAction()==MotionEvent.ACTION_MOVE){
                             holder.imageView.setImageResource(R.drawable.ic_wifi_down);
                         }else {
                             holder.imageView.setImageResource(R.drawable.ic_wifi_normal);
                         }

                         break;
                     case 1:
                         if (event.getAction()==MotionEvent.ACTION_DOWN || event.getAction()==MotionEvent.ACTION_MOVE){
                             holder.imageView.setImageResource(R.drawable.ic_wlan_hot_down);
                         }else {
                             holder.imageView.setImageResource(R.drawable.ic_wlan_hot_normal);
                         }
                          break;
                     case 2:
                         if (event.getAction()==MotionEvent.ACTION_DOWN || event.getAction()==MotionEvent.ACTION_MOVE){
                             holder.imageView.setImageResource(R.drawable.ic_mobile_network_down);
                         }else {
                             holder.imageView.setImageResource(R.drawable.ic_mobile_network_normal);
                         }
                         break;
                     case 3:
                         if (event.getAction()==MotionEvent.ACTION_DOWN || event.getAction()==MotionEvent.ACTION_MOVE){
                             holder.imageView.setImageResource(R.drawable.ic_application_settings_down);
                         }else {
                             holder.imageView.setImageResource(R.drawable.ic_application_settings_normal);
                         }
                         break;
                     case 4:
                         if (event.getAction()==MotionEvent.ACTION_DOWN || event.getAction()==MotionEvent.ACTION_MOVE){
                             holder.imageView.setImageResource(R.drawable.ic_adjust_settings_down);
                         }else {
                             holder.imageView.setImageResource(R.drawable.ic_adjust_settings_normal);
                         }
                         break;
                     case 5:
                         if (event.getAction()==MotionEvent.ACTION_DOWN || event.getAction()==MotionEvent.ACTION_MOVE){
                             holder.imageView.setImageResource(R.drawable.ic_storage_capacity_down);
                         }else {
                             holder.imageView.setImageResource(R.drawable.ic_storage_capacity_normal);
                         }
                         break;
                     case 6:
                         if (event.getAction()==MotionEvent.ACTION_DOWN || event.getAction()==MotionEvent.ACTION_MOVE){
                             holder.imageView.setImageResource(R.drawable.ic_about_equipment_down);
                         }else {
                             holder.imageView.setImageResource(R.drawable.ic_about_equipment_normal);
                         }
                         break;
                     case 7:
                         if (event.getAction()==MotionEvent.ACTION_DOWN || event.getAction()==MotionEvent.ACTION_MOVE){
                             holder.imageView.setImageResource(R.drawable.ic_push_setting_down);
                         }else {
                             holder.imageView.setImageResource(R.drawable.ic_push_setting_normal);
                         }
                         break;
                     case 8: if (event.getAction()==MotionEvent.ACTION_DOWN || event.getAction()==MotionEvent.ACTION_MOVE){
                         holder.imageView.setImageResource(R.drawable.ic_bluetooth_settings_down);
                     }else {
                         holder.imageView.setImageResource(R.drawable.ic_bluetooth_settings_normal);
                     }
                         break;
                     case 9:
                         if (event.getAction()==MotionEvent.ACTION_DOWN || event.getAction()==MotionEvent.ACTION_MOVE){
                             holder.imageView.setImageResource(R.drawable.ic_backup_reset_down);
                         }else {
                             holder.imageView.setImageResource(R.drawable.ic_backup_reset_normal);
                         }
                         break;
                     case 10: if (event.getAction()==MotionEvent.ACTION_DOWN || event.getAction()==MotionEvent.ACTION_MOVE){
                         holder.imageView.setImageResource(R.drawable.ic_system_switching_down);
                     }else {
                         holder.imageView.setImageResource(R.drawable.ic_system_switching_normal);
                     }
                         break;
                     case 11: if (event.getAction()==MotionEvent.ACTION_DOWN || event.getAction()==MotionEvent.ACTION_MOVE){
                         holder.imageView.setImageResource(R.drawable.ic_bt_volume_down);
                     }else {
                         holder.imageView.setImageResource(R.drawable.ic_bt_volume_normal);
                     }
                         break;


                 }

                 return false;
             }

         });

         holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 switch (position){
//
//                     case 0:
//
//
//                         break;
//                     case 1:
//
//
//                         break;
//                     case 2:
//
//
//                         break;
//                     case 3:
//
//
//                         break;
//                     case 4:
//
//
//                         break;
//                     case 5:
//
//
//                         break;
//                     case 6:
//
//
//                         break;
//                     case 7:
//
//
//                         break;
//                     case 8:
//
//                         break;
//                     case 9:
//
//
//                         break;
//                     case 10:
//
//
//                         break;
//                     case 11 :
//
//                         break;


                 }
             }
         });

     }

}
