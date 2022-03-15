package com.example.drevodavec

import android.os.Bundle
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val treeNames = listOf(
        "dub",
        "buk",
        "lip",
        "jav",
        "jas",
        "jed",
        "smr",
        "bor"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tableLayoutTree = findViewById<TableLayout>(R.id.TableLayoutTree)
        var treeBtnCnt = 0
        for (i in 0..tableLayoutTree.childCount) {
            val child = tableLayoutTree.getChildAt(i)
            if (child is TableRow) {
                treeBtnCnt += child.childCount
            }
        }


        val buttons: Array<Button?> = arrayOfNulls<Button>(treeBtnCnt)
        buttons[0] = findViewById(R.id.button)
        buttons[1] = findViewById(R.id.button2)
        buttons[2] = findViewById(R.id.button3)
        buttons[3] = findViewById(R.id.button4)
        buttons[4] = findViewById(R.id.button5)
        buttons[5] = findViewById(R.id.button6)
        buttons[6] = findViewById(R.id.button7)
        buttons[7] = findViewById(R.id.button8)

        treeNames.mapIndexed { index, s -> buttons[index]?.text = s}
        for(button in buttons) {
            button?.setOnClickListener {
                if (it is Button) {
                    val textView = findViewById<TextView>(R.id.TextViewTreeSelection)
                    textView.text = it.text
                }
            }
        }
    }

}