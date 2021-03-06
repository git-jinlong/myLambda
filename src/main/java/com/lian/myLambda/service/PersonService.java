package com.lian.myLambda.service;

import com.lian.myLambda.model.Person;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 */
public interface PersonService {
   /**
    * @param id 用户信息主键
    * @return
    */
   Person sel(int id);

   /**
    * 获取用户信息列表
    * @return
    */
   List<Person> list();

   /**
    * 根据年级分组获得人员列表
    * @return
    */
   Map<Integer,List<Person>> listGroupByGrade();

   /**
    * 展示所有年级列表
    * @return
    */
   Set<Integer> listGrade();

   /**
    * 将成员列表中包含的国家用符号拼接起来
    * @return
    */
   String putTogetherCountry(String symbol);

   List<Person> uppercaseEnglishName();

   /**
    * 添加用户
    * @param Person
    * @return
    */
   Person add(Person Person);
   /**
    * 更新用户
    * @param Person
    * @return
    */
   Person upd(Person Person);

   /**
    * 删除用户
     * @param id
    * @return
    */
   Person del(Integer id);
}
