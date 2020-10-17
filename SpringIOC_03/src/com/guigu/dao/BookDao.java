package com.guigu.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("booktest")
@Scope(value = "prototype")
public class BookDao {

}
