package com.te.springboot.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.te.springboot.beans.Fitem;
import com.te.springboot.beans.FitemResponce;
import com.te.springboot.service.ItemService;

@RestController
public class ItrmController {
	@Autowired
	private ItemService service;

	@GetMapping(path = "/get", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public FitemResponce getItemDetails(int id) {
		FitemResponce response = new FitemResponce();

		Fitem infoBean = service.getItemData(id);

		if (infoBean != null) {
			response.setStatusCode(200);
			response.setMsg("success");
			response.setBean(infoBean);
		} else {
			response.setStatusCode(404);
			response.setMsg("Failure");
		}
		return response;
	}
	@PostMapping(path = "/add" , produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
    , consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }   )
public FitemResponce addEmployee(@RequestBody FileItem infoBean) {
		FitemResponce response = new FitemResponce();

if (service.additem(infoBean)) {
response.setStatusCode(200);
response.setMsg("success , Added Successfully");
} else {
response.setStatusCode(404);
response.setMsg("Failure");
}
return response;
}

@GetMapping(path = "/getAll", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
public FitemResponce getAllEmployeeDetails() {
	FitemResponce response = new FitemResponce();
List<Fitem> infoBeans = service.getAllDetails();

if (infoBeans != null) {
response.setStatusCode(200);
response.setMsg("success");

} else {
response.setStatusCode(400);
response.setMsg("Datas not found");
}

return response;
}// END OF GETALL

}
