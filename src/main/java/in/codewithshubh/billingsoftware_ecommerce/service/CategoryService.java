package in.codewithshubh.billingsoftware_ecommerce.service;

import in.codewithshubh.billingsoftware_ecommerce.io.CategoryRequest;
import in.codewithshubh.billingsoftware_ecommerce.io.CategoryResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface CategoryService {

    CategoryResponse add(CategoryRequest request, MultipartFile file) throws IOException;

    List<CategoryResponse> read();

    void delete(String categoryId);
}
