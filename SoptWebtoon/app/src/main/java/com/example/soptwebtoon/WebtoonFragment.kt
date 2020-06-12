package com.example.soptwebtoon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.semina2.WebtoonAdapter
import kotlinx.android.synthetic.main.fragment_webtoon.*

class WebtoonFragment : Fragment() {

    lateinit var webtoonAdapter: WebtoonAdapter
    val datas = mutableListOf<WebtoonData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_webtoon, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        webtoonAdapter = WebtoonAdapter(view.context)
        rv_webtoon.adapter= webtoonAdapter
        loadDatas()
    }

    private fun loadDatas(){
        datas.apply {
            add(
                WebtoonData(
                    img_contents = R.drawable.doctor,
                    name = "유미의 세포들",
                    star ="9.1",
                    author = "솝트"
                )
            )
            add(
                WebtoonData(
                    img_contents = R.drawable.i2,
                    name = "좋아하면 울리는",
                    star ="9.9",
                    author = "귀여미"
                )
            )
            add(
                WebtoonData(
                    img_contents = R.drawable.i3,
                    name = "굿바이 사돈",
                    star ="9.0",
                    author = "벋벋"
                )
            )
            add(
                WebtoonData(
                    img_contents = R.drawable.i4,
                    name = "혁명",
                    star ="8.3",
                    author = "김가인"
                )
            )
            add(
                WebtoonData(
                    img_contents = R.drawable.i6,
                    name = "버디버디",
                    star ="8.2",
                    author = "잼잼"
                )
            )
            add(
                WebtoonData(
                    img_contents = R.drawable.i7,
                    name = "꿈나라",
                    star ="5.8",
                    author = "챙챙"
                )
            )
            add(
                WebtoonData(
                    img_contents = R.drawable.i8,
                    name = "웃어용",
                    star ="10.2",
                    author = "스마일"
                )
            )
            add(
                WebtoonData(
                    img_contents = R.drawable.i9,
                    name = "겟백",
                    star ="9.9",
                    author = "검은인간"
                )
            )
            add(
                WebtoonData(
                    img_contents = R.drawable.i6,
                    name = "헬프맨",
                    star ="9.7",
                    author = "재미"
                )
            )
        }
        webtoonAdapter.datas = datas
        webtoonAdapter.notifyDataSetChanged()
        rv_webtoon.addItemDecoration(ItemDecoration())

    }
}