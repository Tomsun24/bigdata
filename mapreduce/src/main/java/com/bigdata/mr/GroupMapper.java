package com.bigdata.mr;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class GroupMapper extends Mapper<LongWritable, Text,Text, IntWritable> {
    Text k=new Text();
    IntWritable v=new IntWritable(1);

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String[] splitwords = value.toString().split("/t");
        for (int i = 0; i < splitwords.length; i++) {
            k.set(splitwords[i]);
            context.write(k,v);
        }
    }
}
