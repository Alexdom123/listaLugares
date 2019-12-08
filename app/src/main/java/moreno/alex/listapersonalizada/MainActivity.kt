package moreno.alex.listapersonalizada
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.Response.Listener
import com.android.volley.toolbox.*
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONArray
class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lugares = ArrayList<Lugar>()

        lugares.add(Lugar("México", "https://www.mexicodesconocido.com.mx/wp-content/uploads/2019/03/CDMX-Panorama_sin_t%C3%ADtulo1_color_02_Trabajo_IG.jpg", "El chapo Guzman"))
        lugares.add(Lugar("Japón", "https://www.viajesolympiamadrid.com/especiales/wp-content/uploads/2017/02/VIAJE-SEMANA-SANTA-JAPON-768x384.jpg", "takatakatakataka"))
        lugares.add(Lugar("Brazil", "https://ca-times.brightspotcdn.com/dims4/default/d6c49a0/2147483647/strip/true/crop/2048x1151+0+0/resize/840x472!/quality/90/?url=https%3A%2F%2Fcalifornia-times-brightspot.s3.amazonaws.com%2F61%2Ffb%2Fdc921ccd651569c24e142804d3b7%2Fla-1553121437-jhhmvks1tp-snap-image", "Ronaldinho, joga bonito"))
        lugares.add(Lugar("Rusia", "https://www.anahuac.mx/generacion-anahuac/sites/default/files/articles/restaurantes_rusos.jpeg", "Tripolosky"))



        myRV.adapter = LugarAdapter(lugares,  context = this)
        myRV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        }
}

