package in.codewithshubh.billingsoftware_ecommerce.service;

import in.codewithshubh.billingsoftware_ecommerce.io.ItemRequest;
import in.codewithshubh.billingsoftware_ecommerce.io.ItemResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ItemService {

    ItemResponse add(ItemRequest request, MultipartFile file) throws IOException;

    List<ItemResponse> fetchItems();

    void deleteItem(String itemId);
}
