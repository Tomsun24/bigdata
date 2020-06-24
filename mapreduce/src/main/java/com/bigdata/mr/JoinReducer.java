package com.bigdata.mr;

import com.bigdata.bean.JoinBean;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class JoinReducer extends Reducer<Text, JoinBean,JoinBean, NullWritable> {
    @Override
    protected void reduce(Text key, Iterable<JoinBean> values, Context context) throws IOException, InterruptedException {
        super.reduce(key, values, context);
    }
}
