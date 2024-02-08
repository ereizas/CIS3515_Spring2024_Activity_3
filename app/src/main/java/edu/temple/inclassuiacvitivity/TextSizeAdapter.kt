package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(val context:Context, widget_ID: Int,val arr:Array<Int>) : BaseAdapter() {

    override fun getCount(): Int {
        return arr.size
    }

    override fun getItem(position: Int): Any {
        return arr[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView : TextView
        if (convertView != null)
        {
            textView = convertView as TextView
        }
        else
        {
            textView = TextView(context)
            textView.textSize = 22f
            textView.setPadding(5, 10, 0, 10)
        }
        textView.text=arr[position].toString()
        textView.textSize=22f
        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView : TextView
        if (convertView != null)
        {
            textView = convertView as TextView
        }
        else
        {
            textView = TextView(context)
            textView.textSize = 22f
            textView.setPadding(5, 10, 0, 10)
        }
        textView.text=arr[position].toString()
        textView.textSize=arr[position].toFloat()
        return textView
    }

}