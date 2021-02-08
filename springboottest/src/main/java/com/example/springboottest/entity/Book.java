package com.example.springboottest.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * FileName:Book
 * Author: yuxiaoyin
 * Date: 2021/2/6 11:43
 * Description: Book的实体类
 */
@Entity
@Data
public class Book {
    @Id
    private Integer id;
    private  String name;
    private  String author;
}
