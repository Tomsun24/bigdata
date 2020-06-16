package com.bigdata.flink

import org.apache.flink.streaming.api.scala._

object FlinkDemo{

  def main(args: Array[String]): Unit = {
    val env = StreamExecutionEnvironment.getExecutionEnvironment
    env.socketTextStream("localhost",8888).flatMap(_.split(",")).map((_,1)).keyBy(1).sum(2).print()
    env.execute("myflink")

  }

}