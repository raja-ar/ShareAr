package com.raja.shareArFront.roomview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.raja.shareArFront.R;

/**
 * Created by Yu on 2014/12/13.
 */

public class ShareArImageView extends ImageView {

    private float angle = 0;
    private int position = 0;
    private String rid;
    private String name;

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    
    public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    /**
     * @param context
     */
    public ShareArImageView(Context context) {
        this(context, null);
    }

    /**
     * @param context
     * @param attrs
     */
    public ShareArImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    /**
     * @param context
     * @param attrs
     * @param defStyle
     */
    public ShareArImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs,
                    R.styleable.ShareArImageView);
            rid = a.getString(R.styleable.ShareArImageView_rid);
            name = a.getString(R.styleable.ShareArImageView_name);
        }
    }

}
