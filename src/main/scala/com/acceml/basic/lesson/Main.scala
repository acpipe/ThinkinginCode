package com.acceml.basic.lesson

import com.hit.learn.proxy.Phone

/**
  * Created by Acceml on 2016/12/13.
  */
object Main {

  def f(s: String) = {

  }

  def main(args: Array[String]): Unit = {
    val phone: Phone = new Phone
    phone.call()
    val phone2 = Phone.callStatic()
    phone2.call()
  }
}
