package azat.curs.curs.controllers;


import azat.curs.curs.models.Client;
import azat.curs.curs.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ClientController {
    @Autowired
    private ClientService clientService;

    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<Client> clientList = clientService.listAllClients();
        model.addAttribute("clientList", clientList);
        return "index";
    }
    @RequestMapping("/new")
    public  String showNewClientForm(Model model){
        Client client = new Client();
        model.addAttribute("client", client);

        return "new-client";
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveClient(@ModelAttribute("client") Client client){
        clientService.saveClient(client);

        return "redirect:/";
    }
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditClientForm(@PathVariable(name = "id") Integer id){
      ModelAndView modelAndView = new ModelAndView("edit-client");
      Client client = clientService.getById(id);
      modelAndView.addObject("client", client);
        return modelAndView;
    }

    @RequestMapping("/delete/{id}")
    public String deleteById(@PathVariable(name = "id") Integer id){
        clientService.delete(id);
        return "redirect:/";
    }
}
