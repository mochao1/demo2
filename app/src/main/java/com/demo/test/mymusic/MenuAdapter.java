package com.demo.test.mymusic;

import android.content.Context;

import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;

/**
 * @author Messi.Mo
 * @date 2019/12/23
 * description:
 */

public class MenuAdapter extends CommonAdapter<String> {

    public MenuAdapter(Context context, int layoutId, List<String> datas) {
        super(context, layoutId, datas);
    }

    @Override
    protected void convert(ViewHolder holder, String s, int position) {
          holder.setText(R.id.item_name,s);
    }
}
