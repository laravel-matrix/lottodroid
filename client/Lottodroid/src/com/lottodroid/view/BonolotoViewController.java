package com.lottodroid.view;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lottodroid.R;
import com.lottodroid.model.Bonoloto;

class BonolotoViewController implements LotteryViewController<Bonoloto> {

  private static final long serialVersionUID = 3726644726024636635L;

  private final String title;

  public BonolotoViewController(String title) {
    this.title = title;
  }

  @Override
  public View createAndFillUpMainView(Bonoloto bonoloto, Context context) {
    View layoutView = View.inflate(context, R.layout.main_layout_row, null);
    LinearLayout layoutContent = (LinearLayout) layoutView.findViewById(R.id.layoutContent);
    layoutContent.addView(View.inflate(context, R.layout.bonoloto_content_row, null));

    ((ImageView) layoutView.findViewById(R.id.icon)).setImageResource(R.drawable.bonoloto);
    ((TextView) layoutView.findViewById(R.id.title)).setText(bonoloto.getName());
    ((TextView) layoutView.findViewById(R.id.date)).setText(bonoloto.getDate().toString());

    fillUpView(layoutView, bonoloto);

    return layoutView;
  }

  @Override
  public View createAndFillUpDetailsView(Bonoloto bonoloto, Context context) {
    View convertView = View.inflate(context, R.layout.bonoloto_content_row, null);

    convertView.setPadding(20, 5, 0, 5);
    convertView.setBackgroundColor(Color.parseColor("#323232"));

    fillUpView(convertView, bonoloto);

    return convertView;
  }

  private void fillUpView(View view, Bonoloto bonoloto) {
    ((TextView) view.findViewById(R.id.txtNumbers)).setText(bonoloto.getNumbers());
    ((TextView) view.findViewById(R.id.txtComplementary)).setText(bonoloto.getComplementario());
    ((TextView) view.findViewById(R.id.txtReinteger)).setText(bonoloto.getReintegro());
  }

  @Override
  public int getIconResource() {
    return R.drawable.bonoloto;
  }

  @Override
  public String getTitle() {
    return title;
  }

  @Override
  public LotteryId getId() {
    return LotteryViewController.LotteryId.BONOLOTO;
  }

}