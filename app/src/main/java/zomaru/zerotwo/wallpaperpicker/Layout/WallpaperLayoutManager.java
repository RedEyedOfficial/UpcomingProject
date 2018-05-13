package zomaru.zerotwo.wallpaperpicker;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class WallpaperLayoutManager extends RecyclerView.ItemDecoration {
    private final int space;

    public WallpaperLayoutManager (int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.left = space;
        outRect.right = space;
        outRect.bottom = space;

        if (parent.getChildAdapterPosition(view) == 0)
            outRect.top = space;
    }
}

