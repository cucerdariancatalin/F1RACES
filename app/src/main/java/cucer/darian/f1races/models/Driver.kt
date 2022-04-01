package cucer.darian.f1races.models

import com.google.gson.annotations.SerializedName

data class Driver(@SerializedName("driverName")val name: String = "",
                  @SerializedName("age") val age: Int = 0)
