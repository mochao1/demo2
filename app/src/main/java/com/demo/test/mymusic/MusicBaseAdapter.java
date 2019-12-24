package com.demo.test.mymusic;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;

/**
 * @author Messi.Mo
 * @date 2019/12/23
 * description:
 */

public class MusicBaseAdapter extends CommonAdapter<MusicBaseInfo> {

    public MusicBaseAdapter(Context context, int layoutId, List<MusicBaseInfo> datas) {
        super(context, layoutId, datas);
    }

    @Override
    protected void convert(ViewHolder holder, MusicBaseInfo musicBaseInfo, int position) {
        Glide.with(mContext).load(musicBaseInfo.getImageRes()).into((ImageView) holder.getView(R.id.image_music));
        holder.setText(R.id.name_music,musicBaseInfo.getName());
    }
}
