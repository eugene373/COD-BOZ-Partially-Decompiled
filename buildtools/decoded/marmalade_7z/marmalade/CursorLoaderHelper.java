package com.ideaworks3d.marmalade;

import android.content.CursorLoader;
import android.content.Loader.OnLoadCompleteListener;
import android.database.Cursor;
import android.net.Uri;

public class CursorLoaderHelper {
      public static boolean getCursor(Uri var0, String[] var1, final LoaderActivity.CursorCompleteListener var2) {
            try {
                  CursorLoader var3 = new CursorLoader(LoaderAPI.getActivity(), var0, var1, (String)null, (String[])null, (String)null);
                  var3.registerListener(0, (OnLoadCompleteListener) (var11, var2x) -> {
                        LoaderAPI.trace("CursorLoader onLoadComplete");
                        var2.cursorLoadComplete((Cursor) var2x);
                  });
                  var3.startLoading();
            } catch (Exception var4) {
                  LoaderAPI.trace("Could not create cursorLoader " + var4);
                  LoaderAPI.trace(var4.getMessage());
            }

            return false;
      }
}
