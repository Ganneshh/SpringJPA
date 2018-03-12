package service;

import entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CustomerRepository;
import dto.*;

@Service
public class CustomerService {

    CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerEntity getCustomer(Integer id) {
        return null;
    }

    public CustomerEntity save(Customer customer) {
        return null;
    }
//    public List<String> getFireRating(DoorItemRequest queryRequest) {
//        Assert.notNull(queryRequest.getUnitId(), "Slab ID is required.");
//        Assert.notNull(queryRequest.getDoorType(), "Door Type is required");
//
//        List<String> returned = new ArrayList<>();
//        returned.add("none");
//        if (queryRequest.getDoorType().equals("entry")) {
//            String filter = String.format("unit.id==%s;options.is_entry==true;options.is_fireratable==true", queryRequest.getUnitId());
//            if (super.exists(filter)) {
//                returned.add("fireRatable");
//            }
//        }
//        return returned;
//    }
//
//    public Map<String, Object> getMfgCode(DoorItemRequest request) {
//        Assert.notNull(request.getUnitId(), "Slab ID is Required");
//        Assert.notNull(request.getWidth(), "Width is Required");
//        Assert.notNull(request.getHeight(), "Height is Required");
//        Assert.notNull(request.getThickness(), "Thickness is Required");
//        Assert.notNull(request.getPanelId(), "Panel ID is Required");
//
//        String unitId = String.format("unit.id==%s", request.getUnitId());
//        String height = String.format("dimensions.height==%s", request.getHeight());
//        String width = String.format("dimensions.width==%s", request.getWidth());
//        String thickness = String.format("dimensions.thickness==%s", request.getThickness());
//        String panelId = String.format("panel.id==%s", request.getPanelId());
//
//        String filter = String.join(";", Arrays.asList(
//                unitId,
//                height,
//                width,
//                thickness,
//                panelId
//        ));
//
//        Door door = super.getByFilter(filter);
//
//        Map<String, Object> returnMap = new HashMap<>();
//        returnMap.put("mfg_code", door.getMfgCode());
//        returnMap.put("prod_type", door.getProdType());
//
//        return returnMap;
//    }
}
