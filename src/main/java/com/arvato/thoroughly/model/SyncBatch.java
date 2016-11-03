/**
 * Created by Kalend Zhang on 2016/10/25,025 .
 */

package com.arvato.thoroughly.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class SyncBatch implements Serializable
{

   @Expose
   @SerializedName("sync_last_time")
   private String syncLastTime;

   public String getSyncLastTime()
   {
      return syncLastTime;
   }

   public void setSyncLastTime(String syncLastTime)
   {
      this.syncLastTime = syncLastTime;
   }

}
