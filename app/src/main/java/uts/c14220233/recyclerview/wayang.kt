package uts.c14220233.recyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

data class wayang(
    var foto : String,
    var nama : String,
    var karakter : String,
    var deskripsi : String
)