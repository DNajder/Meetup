package sdainalproject.meetup.mapper;

import org.springframework.core.convert.converter.Converter;
import sdainalproject.meetup.dao.UserModel;
import sdainalproject.meetup.dto.UserRegisterDto;

public class UserModelToRegisterMaper implements Converter<UserModel, UserRegisterDto> {
    @Override
    public UserRegisterDto convert(UserModel userModel) {
        if(userModel == null) {
            return null;
        }
       final UserRegisterDto userRegisterDto = new UserRegisterDto();
        userRegisterDto.setName(userModel.getName());
        userRegisterDto.setEmail(userModel.getEmail());
        userRegisterDto.setPassword(userModel.getPasswordHash());
        return userRegisterDto;
    }

}
