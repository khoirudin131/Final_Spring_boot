package com.example.aeon.dto.mapper;
import com.example.aeon.dto.request.KaryawanRequest;
import com.example.aeon.dto.response.KaryawanResponse;
import com.example.aeon.entity.KaryawanEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface KaryawanMapper {
    KaryawanMapper MAPPER = Mappers.getMapper(KaryawanMapper.class);
    KaryawanEntity fromRequestToEntity(KaryawanRequest karyawanRequest);
    KaryawanResponse fromEntityToResponse(KaryawanEntity karyawanEntity);
}
