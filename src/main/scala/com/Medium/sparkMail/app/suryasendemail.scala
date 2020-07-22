package com.Medium.sparkMail.app

import com.Medium.sparkMail.surya
import org.apache.spark.sql.SparkSession

object suryasendemail {

  def main(args: Array[String]): Unit = {

    implicit val spark = SparkSession.builder()
      .appName("Spark_Mail_Job")
      .master("local[*]")
      .getOrCreate()

      surya().SendEmailsurya()

  }

}
