package chavez.alma.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var intent = Intent(this, ProductsActivity::class.java)

        button_cold_drinks.setOnClickListener{
            intent.putExtra("type", "coldDrinks")
            startActivity(intent)
        }

        button_hot_drinks.setOnClickListener{
            intent.putExtra("type", "hotDrinks")
            startActivity(intent)
        }

        sweets.setOnClickListener{
            intent.putExtra("type", "sweets")
            startActivity(intent)
        }

        salties.setOnClickListener{
            intent.putExtra("type", "salties")
            startActivity(intent)
        }
    }


}
