package com.demo.test.mymusic;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;

/**
 * @author Messi.Mo
 * @date 2019/12/23
 * description:
 */

public class TestAdapter extends CommonAdapter<TestInfo> {

    public TestAdapter(Context context, int layoutId, List<TestInfo> datas) {
        super(context, layoutId, datas);
    }

    @Override
    protected void convert(final ViewHolder holder, TestInfo s, int position) {
        holder.setText(R.id.title_content, s.getTitleName());
        holder.setText(R.id.text_answer, s.getCorrectValue());
        if (!TextUtils.isEmpty(s.getOptions().get(0))) {
            holder.setText(R.id.option_a, "A "+s.getOptions().get(0));
        }
        if (!TextUtils.isEmpty(s.getOptions().get(1))) {
            holder.setText(R.id.option_b, "B "+s.getOptions().get(1));
        }
        if (!TextUtils.isEmpty(s.getOptions().get(2))) {
            holder.setText(R.id.option_c, "C "+s.getOptions().get(2));
        }
        if (!TextUtils.isEmpty(s.getOptions().get(3))) {
            holder.setText(R.id.option_d, "D "+s.getOptions().get(3));
        }

        holder.setOnClickListener(R.id.btn_answer, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.getView(R.id.text_answer).setVisibility(View.VISIBLE);
            }
        });
    }
}
