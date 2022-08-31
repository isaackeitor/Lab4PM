package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource() {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, "https://www.mundodeportivo.com/files/image_948_465/uploads/2019/12/01/60e7b0eca8f01.jpeg"),
            Affirmation(R.string.affirmation2, "https://estaticos-cdn.sport.es/clip/494f9883-2412-4e08-80b4-f961e29d2429_media-libre-aspect-ratio_default_0.jpg"),
            Affirmation(R.string.affirmation3, "https://cdn-3.expansion.mx/dims4/default/6395be0/2147483647/strip/true/crop/624x351+0+0/resize/1200x675!/format/webp/quality/90/?url=https%3A%2F%2Fcherry-brightspot.s3.amazonaws.com%2Fmedia%2F2012%2F01%2F09%2Fmessi-fifa-afp.jpg"),
            Affirmation(R.string.affirmation4, "https://estaticos-cdn.sport.es/clip/56c353b8-a1b4-4747-a02f-9b4c592f73c5_media-libre-aspect-ratio_default_0.jpg"),
            Affirmation(R.string.affirmation5, "https://estaticos-cdn.elperiodico.com/clip/74c504c1-11eb-4ddc-aeda-b94690520177_alta-libre-aspect-ratio_default_0.jpg"),
            Affirmation(R.string.affirmation6, "https://e00-marca.uecdn.es/assets/multimedia/imagenes/2019/12/02/15753211669003.jpg"),
            Affirmation(R.string.affirmation7, "https://www.mdzol.com/u/fotografias/m/2021/12/9/f848x477-1148747_1206550_3742.png"),
            Affirmation(R.string.affirmation8, "https://pbs.twimg.com/media/FOUjBIOWYAAPe1E?format=jpg&name=900x900"),
            Affirmation(R.string.affirmation9, "https://cdn.vox-cdn.com/thumbor/eyZNxG_VoRKvsuovtlGgbNTbXAs=/0x0:3216x2141/1820x1213/filters:focal(864x596:1378x1110):format(webp)/cdn.vox-cdn.com/uploads/chorus_image/image/71294864/1242786237.0.jpg"),
            Affirmation(R.string.affirmation10, "https://assets.goal.com/v3/assets/bltcc7a7ffd2fbf71f5/bltfd95644c573596b4/60da87e00401cb0ebfa69178/0de6c7ef998109656e966f4f6db8a6cb229678cd.jpg?quality=80&format=pjpg&auto=webp&width=876")
        )
    }
}