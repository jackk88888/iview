package com.hy.spring.cloud.util.service;

import com.hy.spring.cloud.util.domain.Entity.Attachment;
import com.hy.spring.cloud.util.domain.Entity.Message;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface UtilService {

    Message uploadAttachment(MultipartFile fileList);

    Message saveFileList(List<Attachment> attachmentList);

    void fileDownLoad(HttpServletResponse response, String fileId);

    Message deleteFileList(List<Attachment> attachmentList);

    List<Attachment> queryAttachmentList(Attachment attachment);

    Message deleteFile(String fileId);
}
