package team.educoin.transaction.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @description: user_consume
 * @author: PandaClark
 * @create: 2019-05-16
 */
@Component
public interface UserConsumeMapper {

    String TABLE_NAME = "user_consume";
    String INSERT_FIELDS = "email, service_id, transaction_id, file_title, file_readPrice, file_name";
    String SELECT_FIELDS = "id, " + INSERT_FIELDS + ", create_time, update_time";

    @Insert({"insert into ", TABLE_NAME, "(",INSERT_FIELDS,") values (#{email},#{service_id},#{transaction_id},#{file_title},#{file_readPrice},#{file_name})"})
    int addRecord(Map<String,Object> map);


    @Select({"select service_id from ", TABLE_NAME, "where email=#{email}"})
    List<String> getServiceIdsByEmail(@Param("email") String email);
}
