package guli.parit.mapper;

import java.util.List;


public interface UserMapper {
    /**
     * 根据用户ID和用户名称查询
     * @param userId
     * @param userName
     * @return
     */
    public String UserName(int userId,String userName);
}
