package lec05.sse.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FruitMapper {
  @Select("SELECT ID, NAME,PRICE FROM FRUIT")
  ArrayList<Fruit> selectAllFruit();

  @Select("select ID, NAME,PRICE from FRUIT WHERE ID = #{id}")
  Fruit selectById(int id);

}
