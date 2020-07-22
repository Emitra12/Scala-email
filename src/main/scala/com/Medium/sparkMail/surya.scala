package com.Medium.sparkMail

import com.spark.mail.Email
import org.apache.spark.sql.SparkSession

class surya (implicit spark: SparkSession) {

  def SendEmailsurya(): Unit = {
      try {
        val df = spark.read.option("header", "true").csv("C:/Users/surya.sengar/Desktop/SendEmail/" +
          "src/main/resources/sample.csv")
        df.show(10,false)
        df.write.format("csv").option("header", "true").save("C:/Users/surya.sengar/Desktop/output")

      } catch {
        case e: Exception =>
        val error_msg = e.toString
        val appID = spark.sparkContext.applicationId
        val obj = new Email("C:/Users/surya.sengar/Desktop/SendEmail/src/main/resources/application.conf")
        obj.sendMail(error_msg, appID, "", "F")
    }
}

  spark.stop()

  }

object surya {
  def apply()(implicit sparkSession: SparkSession): surya = new surya()
}