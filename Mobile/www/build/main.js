webpackJsonp([7],{

/***/ 113:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return DetalhePessoaPage; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(15);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


/**
 * Generated class for the DetalhePessoaPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */
var DetalhePessoaPage = /** @class */ (function () {
    function DetalhePessoaPage(navCtrl, navParams) {
        this.navCtrl = navCtrl;
        this.navParams = navParams;
    }
    DetalhePessoaPage.prototype.ionViewDidLoad = function () {
        console.log('ionViewDidLoad DetalhePessoaPage');
    };
    DetalhePessoaPage = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["m" /* Component */])({
            selector: 'page-detalhe-pessoa',template:/*ion-inline-start:"C:\Users\sett\Desktop\AdventureWorks\AdventureWorks\src\pages\detalhe-pessoa\detalhe-pessoa.html"*/'<ion-header>\n  <ion-navbar color="cNav">\n    <!-- Title -->\n    <ion-title>Detalhe</ion-title>\n  </ion-navbar>\n</ion-header>\n\n\n<ion-content>\n\n  <ion-list>\n    <ion-item style="background-color: #f6f6f6;">\n      <ion-avatar item-start="">\n        <img src="assets/imgs/contact.png">\n      </ion-avatar>\n      <ion-label>\n        <h2>Marty McFly</h2>\n        <p>Estagiario</p>\n      </ion-label>\n    </ion-item>\n    <ion-item style="background-color: #f6f6f6;">\n      <ion-label >\n        CPF\n      </ion-label>\n      <ion-note item-end="" color="pCompra">\n        07532545261\n      </ion-note>\n    </ion-item>\n    <ion-item style="background-color: #f6f6f6;">\n      <ion-label>\n        Data de Nascimento\n      </ion-label>\n      <ion-note item-end="" color="pCompra">\n        26/10/1986\n      </ion-note>\n    </ion-item>\n    <ion-item style="background-color: #f6f6f6;">\n      <ion-label >\n        Área\n      </ion-label>\n      <ion-note item-end="" color="pCompra">\n       Desenvolvedor\n      </ion-note>\n    </ion-item>\n  </ion-list>\n\n</ion-content>'/*ion-inline-end:"C:\Users\sett\Desktop\AdventureWorks\AdventureWorks\src\pages\detalhe-pessoa\detalhe-pessoa.html"*/,
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["h" /* NavController */], __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["i" /* NavParams */]])
    ], DetalhePessoaPage);
    return DetalhePessoaPage;
}());

//# sourceMappingURL=detalhe-pessoa.js.map

/***/ }),

/***/ 114:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return EstoquePage; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(15);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_ionic_angular_components_alert_alert_controller__ = __webpack_require__(52);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



/**
 * Generated class for the EstoquePage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */
var EstoquePage = /** @class */ (function () {
    function EstoquePage(navCtrl, navParams, alertCtrl) {
        this.navCtrl = navCtrl;
        this.navParams = navParams;
        this.alertCtrl = alertCtrl;
    }
    EstoquePage.prototype.ionViewDidLoad = function () {
        console.log('ionViewDidLoad EstoquePage');
    };
    EstoquePage.prototype.showCheckbox = function () {
        var _this = this;
        var alert = this.alertCtrl.create();
        alert.setTitle('Filtrar por:');
        alert.addInput({
            type: 'checkbox',
            label: 'Disponível',
            value: 'value1'
        });
        alert.addInput({
            type: 'checkbox',
            label: 'Indisponível',
            value: 'value2'
        });
        alert.addButton('Cancelar');
        alert.addButton({
            text: 'Filtrar',
            handler: function (data) {
                _this.testCheckboxOpen = false;
                _this.testCheckboxResult = data;
            }
        });
        alert.present().then(function () {
            _this.testCheckboxOpen = true;
        });
    };
    EstoquePage = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["m" /* Component */])({
            selector: 'page-estoque',template:/*ion-inline-start:"C:\Users\sett\Desktop\AdventureWorks\AdventureWorks\src\pages\estoque\estoque.html"*/'<ion-header>\n  <ion-navbar color="cNav">\n    <!-- Title -->\n    <ion-title>Estoque</ion-title>\n    <ion-buttons end (click)="showCheckbox()">\n      <button ion-button icon-only>\n        <ion-icon name="funnel"></ion-icon>\n      </button>\n    </ion-buttons>\n  </ion-navbar>\n</ion-header>\n\n\n<ion-content>\n  <ion-list>\n    <ion-item>\n      <h2>BikeBilenky</h2>\n      <p>Categoria: Mountain Bike</p>\n      <ion-badge color="cotada" item-end>06</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>Basso</h2>\n      <p>Categoria: Urbana</p>\n      <ion-badge color="cotada" item-end>12</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>Adler</h2>\n      <p>Categoria: Urbana</p>\n      <ion-badge color="cotada" item-end>03</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>BerlinBH</h2>\n      <p>Categoria: Urbana</p>\n      <ion-badge color="cotada" item-end>07</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>BMC</h2>\n      <p>Categoria: Fixa</p>\n      <ion-badge color="cotada" item-end>05</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>Bootie</h2>\n      <p>Categoria: Fixa</p>\n      <ion-badge color="cotada" item-end>08</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>Bottecchia</h2>\n      <p>Categoria: Speed</p>\n      <ion-badge color="cotada" item-end>16</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>Author</h2>\n      <p>Categoria: Urbana</p>\n      <ion-badge color="cotada" item-end>11</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>Birdy</h2>\n      <p>Categoria: Speed</p>\n      <ion-badge color="cotada" item-end>09</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>Bickerton</h2>\n      <p>Categoria: Mountain Bike</p>\n      <ion-badge color="rejeitada" item-end>00</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>Atala</h2>\n      <p>Categoria: Urbana</p>\n      <ion-badge color="rejeitada" item-end>00</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>Bataglin</h2>\n      <p>Categoria: Urbana</p>\n      <ion-badge color="rejeitada" item-end>00</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>Alan</h2>\n      <p>Categoria: Urbana</p>\n      <ion-badge color="rejeitada" item-end>00</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>Botrager</h2>\n      <p>Categoria: Fixa</p>\n      <ion-badge color="rejeitada" item-end>00</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>Accell</h2>\n      <p>Categoria: Fixa</p>\n      <ion-badge color="rejeitada" item-end>00</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>Adler</h2>\n      <p>Categoria: Speed</p>\n      <ion-badge color="rejeitada" item-end>00</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>Aist</h2>\n      <p>Categoria: Urbana</p>\n      <ion-badge color="rejeitada" item-end>00</ion-badge>\n    </ion-item>\n  </ion-list>\n\n</ion-content>'/*ion-inline-end:"C:\Users\sett\Desktop\AdventureWorks\AdventureWorks\src\pages\estoque\estoque.html"*/,
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["h" /* NavController */], __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["i" /* NavParams */], __WEBPACK_IMPORTED_MODULE_2_ionic_angular_components_alert_alert_controller__["a" /* AlertController */]])
    ], EstoquePage);
    return EstoquePage;
}());

//# sourceMappingURL=estoque.js.map

/***/ }),

/***/ 115:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return IntroPage; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(15);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__login_login__ = __webpack_require__(89);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



/**
 * Generated class for the IntroPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */
var IntroPage = /** @class */ (function () {
    function IntroPage(navCtrl, navParams) {
        this.navCtrl = navCtrl;
        this.navParams = navParams;
    }
    IntroPage.prototype.ionViewDidLoad = function () {
        console.log('ionViewDidLoad IntroPage');
    };
    IntroPage.prototype.irParaLogin = function () {
        this.navCtrl.setRoot(__WEBPACK_IMPORTED_MODULE_2__login_login__["a" /* LoginPage */]);
    };
    IntroPage = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["m" /* Component */])({
            selector: 'page-intro',template:/*ion-inline-start:"C:\Users\sett\Desktop\AdventureWorks\AdventureWorks\src\pages\intro\intro.html"*/'<!--\n  Generated template for the IntroPage page.\n\n  See http://ionicframework.com/docs/components/#navigation for more info on\n  Ionic pages and navigation.\n-->\n<ion-spinner name="circles" *ngIf="companies == 0" style="color: #ecb61b !important;"></ion-spinner>\n<ion-content style="background: #FCFCFC" *ngIf="companies != 0">\n\n  <ion-slides pager="true" parallax="true" padding>\n\n    <ion-slide>\n      <div>\n        <img src="assets/imgs/intro1.png" style="width:105%;" />\n      </div>\n      <h2 style="font-size:80%;">Sobre</h2>\n      <p style="font-size:70%;">A Adventure Works Cycles é uma empresa multinacional de fabricação e venda de bikes metálicas e compostas para mercados comerciais norte-americanos,europeus e asiáticos.</p>\n    </ion-slide>\n\n    <ion-slide>\n      <div>\n        <img src="assets/imgs/intro2.png" style="width:105%;" />\n      </div>\n      <h2 style="font-size:80%;">Necessidade</h2>\n      <p style="font-size:70%;">Adventure Works Cycles pretende expandir sua participação de mercado latino-americano visando aumentar suas vendas, e para isso resolveu instalar nova fábrica no Brasil.</p>\n    </ion-slide>\n\n    <ion-slide>\n      <div>\n        <img src="assets/imgs/intro3.png" style="width:105%;" />\n      </div>\n      <h2 style="font-size:80%;">A solução</h2>\n      <p style="font-size:70%;">O controle e manutenção de estoque. Análise e controle de vendas. Controle de Acesso.</p>\n      <p style="font-size:13px;">Ficou Curioso?\n        <strong style="color: #e0b24f; font-size:15px;" (click)="irParaLogin()">Veja mais</strong>\n      </p>\n    </ion-slide>\n\n  </ion-slides>\n\n</ion-content>'/*ion-inline-end:"C:\Users\sett\Desktop\AdventureWorks\AdventureWorks\src\pages\intro\intro.html"*/,
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["h" /* NavController */], __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["i" /* NavParams */]])
    ], IntroPage);
    return IntroPage;
}());

//# sourceMappingURL=intro.js.map

/***/ }),

/***/ 116:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return SobrePage; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(15);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


/**
 * Generated class for the SobrePage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */
var SobrePage = /** @class */ (function () {
    function SobrePage(navCtrl, navParams) {
        this.navCtrl = navCtrl;
        this.navParams = navParams;
    }
    SobrePage.prototype.ionViewDidLoad = function () {
        console.log('ionViewDidLoad SobrePage');
    };
    SobrePage = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["m" /* Component */])({
            selector: 'page-sobre',template:/*ion-inline-start:"C:\Users\sett\Desktop\AdventureWorks\AdventureWorks\src\pages\sobre\sobre.html"*/'<!--\n  Generated template for the SobrePage page.\n\n  See http://ionicframework.com/docs/components/#navigation for more info on\n  Ionic pages and navigation.\n-->\n<ion-header>\n    <ion-navbar color="cNav">\n      <button ion-button icon-only menuToggle>\n        <ion-icon name="menu"></ion-icon>\n      </button>\n      <ion-title>Sobre</ion-title>\n    </ion-navbar>\n  </ion-header>\n  \n  \n  <ion-content #popoverContent class="popover-page">\n    <div>\n      <img src="assets/imgs/logo.png" alt="Logo Obra Prima" style="margin-left:auto; margin-right:auto; padding:5%; background-color:#f6f6f6">\n    </div>\n    <div #popoverText class="text-to-change" style="text-align: justify;">\n      <h3 style="text-align:center;">Sobre Nós</h3>\n      <br/>\n      <div padding>A Adventure Works Cycles é uma empresa multinacional de fabricação e venda de bikes metálicas e compostas para mercados comerciais norte-americanos,europeus e asiáticos.</div>\n      <div padding>Adventure Works Cycles pretende expandir sua participação de mercado latino-americano visando aumentar suas vendas, e para isso resolveu instalar nova fábrica no Brasil.</div>\n    </div>\n  </ion-content>'/*ion-inline-end:"C:\Users\sett\Desktop\AdventureWorks\AdventureWorks\src\pages\sobre\sobre.html"*/,
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["h" /* NavController */], __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["i" /* NavParams */]])
    ], SobrePage);
    return SobrePage;
}());

//# sourceMappingURL=sobre.js.map

/***/ }),

/***/ 126:
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncatched exception popping up in devtools
	return Promise.resolve().then(function() {
		throw new Error("Cannot find module '" + req + "'.");
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = 126;

/***/ }),

/***/ 166:
/***/ (function(module, exports, __webpack_require__) {

var map = {
	"../pages/detalhe-pessoa/detalhe-pessoa.module": [
		461,
		6
	],
	"../pages/estoque/estoque.module": [
		462,
		5
	],
	"../pages/intro/intro.module": [
		463,
		4
	],
	"../pages/inventario/inventario.module": [
		464,
		3
	],
	"../pages/produto/produto.module": [
		465,
		2
	],
	"../pages/recursos-humanos/recursos-humanos.module": [
		467,
		1
	],
	"../pages/sobre/sobre.module": [
		466,
		0
	]
};
function webpackAsyncContext(req) {
	var ids = map[req];
	if(!ids)
		return Promise.reject(new Error("Cannot find module '" + req + "'."));
	return __webpack_require__.e(ids[1]).then(function() {
		return __webpack_require__(ids[0]);
	});
};
webpackAsyncContext.keys = function webpackAsyncContextKeys() {
	return Object.keys(map);
};
webpackAsyncContext.id = 166;
module.exports = webpackAsyncContext;

/***/ }),

/***/ 339:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ConfigProvider; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var config_key_name = "config";
var ConfigProvider = /** @class */ (function () {
    function ConfigProvider() {
    }
    // Recupera os dados do localstorage
    ConfigProvider.prototype.getConfigData = function () {
        return localStorage.getItem(config_key_name);
    };
    // Grava os dados do localstorage
    ConfigProvider.prototype.setConfigData = function (showSlide, name, username) {
        var config = {
            showSlide: false,
            name: "",
            username: ""
        };
        if (showSlide) {
            config.showSlide = showSlide;
        }
        if (name) {
            config.name = name;
        }
        if (username) {
            config.username = username;
        }
        localStorage.setItem(config_key_name, JSON.stringify(config));
    };
    ConfigProvider = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["A" /* Injectable */])(),
        __metadata("design:paramtypes", [])
    ], ConfigProvider);
    return ConfigProvider;
}());

//# sourceMappingURL=config.js.map

/***/ }),

/***/ 340:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser_dynamic__ = __webpack_require__(341);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__app_module__ = __webpack_require__(363);


Object(__WEBPACK_IMPORTED_MODULE_0__angular_platform_browser_dynamic__["a" /* platformBrowserDynamic */])().bootstrapModule(__WEBPACK_IMPORTED_MODULE_1__app_module__["a" /* AppModule */]);
//# sourceMappingURL=main.js.map

/***/ }),

/***/ 363:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__ = __webpack_require__(36);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_ionic_angular__ = __webpack_require__(15);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__ionic_native_splash_screen__ = __webpack_require__(335);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__ionic_native_status_bar__ = __webpack_require__(338);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__app_component__ = __webpack_require__(460);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__pages_home_home__ = __webpack_require__(90);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__providers_config_config__ = __webpack_require__(339);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__pages_sobre_sobre__ = __webpack_require__(116);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__pages_login_login__ = __webpack_require__(89);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__pages_intro_intro__ = __webpack_require__(115);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__pages_produto_produto__ = __webpack_require__(59);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12__pages_inventario_inventario__ = __webpack_require__(60);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13__pages_estoque_estoque__ = __webpack_require__(114);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_14__pages_recursos_humanos_recursos_humanos__ = __webpack_require__(61);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_15__pages_detalhe_pessoa_detalhe_pessoa__ = __webpack_require__(113);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
















var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_1__angular_core__["I" /* NgModule */])({
            declarations: [
                __WEBPACK_IMPORTED_MODULE_5__app_component__["a" /* MyApp */],
                __WEBPACK_IMPORTED_MODULE_6__pages_home_home__["a" /* HomePage */],
                __WEBPACK_IMPORTED_MODULE_8__pages_sobre_sobre__["a" /* SobrePage */],
                __WEBPACK_IMPORTED_MODULE_9__pages_login_login__["a" /* LoginPage */],
                __WEBPACK_IMPORTED_MODULE_10__pages_intro_intro__["a" /* IntroPage */],
                __WEBPACK_IMPORTED_MODULE_11__pages_produto_produto__["a" /* ProdutoPage */],
                __WEBPACK_IMPORTED_MODULE_12__pages_inventario_inventario__["a" /* InventarioPage */],
                __WEBPACK_IMPORTED_MODULE_13__pages_estoque_estoque__["a" /* EstoquePage */],
                __WEBPACK_IMPORTED_MODULE_14__pages_recursos_humanos_recursos_humanos__["a" /* RecursosHumanosPage */],
                __WEBPACK_IMPORTED_MODULE_15__pages_detalhe_pessoa_detalhe_pessoa__["a" /* DetalhePessoaPage */]
            ],
            imports: [
                __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__["a" /* BrowserModule */],
                __WEBPACK_IMPORTED_MODULE_2_ionic_angular__["c" /* IonicModule */].forRoot(__WEBPACK_IMPORTED_MODULE_5__app_component__["a" /* MyApp */], {}, {
                    links: [
                        { loadChildren: '../pages/detalhe-pessoa/detalhe-pessoa.module#DetalhePessoaPageModule', name: 'DetalhePessoaPage', segment: 'detalhe-pessoa', priority: 'low', defaultHistory: [] },
                        { loadChildren: '../pages/estoque/estoque.module#EstoquePageModule', name: 'EstoquePage', segment: 'estoque', priority: 'low', defaultHistory: [] },
                        { loadChildren: '../pages/intro/intro.module#IntroPageModule', name: 'IntroPage', segment: 'intro', priority: 'low', defaultHistory: [] },
                        { loadChildren: '../pages/inventario/inventario.module#InventarioPageModule', name: 'InventarioPage', segment: 'inventario', priority: 'low', defaultHistory: [] },
                        { loadChildren: '../pages/produto/produto.module#ProdutoPageModule', name: 'ProdutoPage', segment: 'produto', priority: 'low', defaultHistory: [] },
                        { loadChildren: '../pages/sobre/sobre.module#SobrePageModule', name: 'SobrePage', segment: 'sobre', priority: 'low', defaultHistory: [] },
                        { loadChildren: '../pages/recursos-humanos/recursos-humanos.module#RecursosHumanosPageModule', name: 'RecursosHumanosPage', segment: 'recursos-humanos', priority: 'low', defaultHistory: [] }
                    ]
                })
            ],
            bootstrap: [__WEBPACK_IMPORTED_MODULE_2_ionic_angular__["a" /* IonicApp */]],
            entryComponents: [
                __WEBPACK_IMPORTED_MODULE_5__app_component__["a" /* MyApp */],
                __WEBPACK_IMPORTED_MODULE_6__pages_home_home__["a" /* HomePage */],
                __WEBPACK_IMPORTED_MODULE_8__pages_sobre_sobre__["a" /* SobrePage */],
                __WEBPACK_IMPORTED_MODULE_9__pages_login_login__["a" /* LoginPage */],
                __WEBPACK_IMPORTED_MODULE_10__pages_intro_intro__["a" /* IntroPage */],
                __WEBPACK_IMPORTED_MODULE_11__pages_produto_produto__["a" /* ProdutoPage */],
                __WEBPACK_IMPORTED_MODULE_12__pages_inventario_inventario__["a" /* InventarioPage */],
                __WEBPACK_IMPORTED_MODULE_13__pages_estoque_estoque__["a" /* EstoquePage */],
                __WEBPACK_IMPORTED_MODULE_14__pages_recursos_humanos_recursos_humanos__["a" /* RecursosHumanosPage */],
                __WEBPACK_IMPORTED_MODULE_15__pages_detalhe_pessoa_detalhe_pessoa__["a" /* DetalhePessoaPage */],
            ],
            providers: [
                __WEBPACK_IMPORTED_MODULE_4__ionic_native_status_bar__["a" /* StatusBar */],
                __WEBPACK_IMPORTED_MODULE_3__ionic_native_splash_screen__["a" /* SplashScreen */],
                { provide: __WEBPACK_IMPORTED_MODULE_1__angular_core__["u" /* ErrorHandler */], useClass: __WEBPACK_IMPORTED_MODULE_2_ionic_angular__["b" /* IonicErrorHandler */] },
                __WEBPACK_IMPORTED_MODULE_7__providers_config_config__["a" /* ConfigProvider */],
            ]
        })
    ], AppModule);
    return AppModule;
}());

//# sourceMappingURL=app.module.js.map

/***/ }),

/***/ 417:
/***/ (function(module, exports, __webpack_require__) {

var map = {
	"./af": 173,
	"./af.js": 173,
	"./ar": 174,
	"./ar-dz": 175,
	"./ar-dz.js": 175,
	"./ar-kw": 176,
	"./ar-kw.js": 176,
	"./ar-ly": 177,
	"./ar-ly.js": 177,
	"./ar-ma": 178,
	"./ar-ma.js": 178,
	"./ar-sa": 179,
	"./ar-sa.js": 179,
	"./ar-tn": 180,
	"./ar-tn.js": 180,
	"./ar.js": 174,
	"./az": 181,
	"./az.js": 181,
	"./be": 182,
	"./be.js": 182,
	"./bg": 183,
	"./bg.js": 183,
	"./bm": 184,
	"./bm.js": 184,
	"./bn": 185,
	"./bn.js": 185,
	"./bo": 186,
	"./bo.js": 186,
	"./br": 187,
	"./br.js": 187,
	"./bs": 188,
	"./bs.js": 188,
	"./ca": 189,
	"./ca.js": 189,
	"./cs": 190,
	"./cs.js": 190,
	"./cv": 191,
	"./cv.js": 191,
	"./cy": 192,
	"./cy.js": 192,
	"./da": 193,
	"./da.js": 193,
	"./de": 194,
	"./de-at": 195,
	"./de-at.js": 195,
	"./de-ch": 196,
	"./de-ch.js": 196,
	"./de.js": 194,
	"./dv": 197,
	"./dv.js": 197,
	"./el": 198,
	"./el.js": 198,
	"./en-au": 199,
	"./en-au.js": 199,
	"./en-ca": 200,
	"./en-ca.js": 200,
	"./en-gb": 201,
	"./en-gb.js": 201,
	"./en-ie": 202,
	"./en-ie.js": 202,
	"./en-il": 203,
	"./en-il.js": 203,
	"./en-nz": 204,
	"./en-nz.js": 204,
	"./eo": 205,
	"./eo.js": 205,
	"./es": 206,
	"./es-do": 207,
	"./es-do.js": 207,
	"./es-us": 208,
	"./es-us.js": 208,
	"./es.js": 206,
	"./et": 209,
	"./et.js": 209,
	"./eu": 210,
	"./eu.js": 210,
	"./fa": 211,
	"./fa.js": 211,
	"./fi": 212,
	"./fi.js": 212,
	"./fo": 213,
	"./fo.js": 213,
	"./fr": 214,
	"./fr-ca": 215,
	"./fr-ca.js": 215,
	"./fr-ch": 216,
	"./fr-ch.js": 216,
	"./fr.js": 214,
	"./fy": 217,
	"./fy.js": 217,
	"./gd": 218,
	"./gd.js": 218,
	"./gl": 219,
	"./gl.js": 219,
	"./gom-latn": 220,
	"./gom-latn.js": 220,
	"./gu": 221,
	"./gu.js": 221,
	"./he": 222,
	"./he.js": 222,
	"./hi": 223,
	"./hi.js": 223,
	"./hr": 224,
	"./hr.js": 224,
	"./hu": 225,
	"./hu.js": 225,
	"./hy-am": 226,
	"./hy-am.js": 226,
	"./id": 227,
	"./id.js": 227,
	"./is": 228,
	"./is.js": 228,
	"./it": 229,
	"./it.js": 229,
	"./ja": 230,
	"./ja.js": 230,
	"./jv": 231,
	"./jv.js": 231,
	"./ka": 232,
	"./ka.js": 232,
	"./kk": 233,
	"./kk.js": 233,
	"./km": 234,
	"./km.js": 234,
	"./kn": 235,
	"./kn.js": 235,
	"./ko": 236,
	"./ko.js": 236,
	"./ky": 237,
	"./ky.js": 237,
	"./lb": 238,
	"./lb.js": 238,
	"./lo": 239,
	"./lo.js": 239,
	"./lt": 240,
	"./lt.js": 240,
	"./lv": 241,
	"./lv.js": 241,
	"./me": 242,
	"./me.js": 242,
	"./mi": 243,
	"./mi.js": 243,
	"./mk": 244,
	"./mk.js": 244,
	"./ml": 245,
	"./ml.js": 245,
	"./mn": 246,
	"./mn.js": 246,
	"./mr": 247,
	"./mr.js": 247,
	"./ms": 248,
	"./ms-my": 249,
	"./ms-my.js": 249,
	"./ms.js": 248,
	"./mt": 250,
	"./mt.js": 250,
	"./my": 251,
	"./my.js": 251,
	"./nb": 252,
	"./nb.js": 252,
	"./ne": 253,
	"./ne.js": 253,
	"./nl": 254,
	"./nl-be": 255,
	"./nl-be.js": 255,
	"./nl.js": 254,
	"./nn": 256,
	"./nn.js": 256,
	"./pa-in": 257,
	"./pa-in.js": 257,
	"./pl": 258,
	"./pl.js": 258,
	"./pt": 259,
	"./pt-br": 260,
	"./pt-br.js": 260,
	"./pt.js": 259,
	"./ro": 261,
	"./ro.js": 261,
	"./ru": 262,
	"./ru.js": 262,
	"./sd": 263,
	"./sd.js": 263,
	"./se": 264,
	"./se.js": 264,
	"./si": 265,
	"./si.js": 265,
	"./sk": 266,
	"./sk.js": 266,
	"./sl": 267,
	"./sl.js": 267,
	"./sq": 268,
	"./sq.js": 268,
	"./sr": 269,
	"./sr-cyrl": 270,
	"./sr-cyrl.js": 270,
	"./sr.js": 269,
	"./ss": 271,
	"./ss.js": 271,
	"./sv": 272,
	"./sv.js": 272,
	"./sw": 273,
	"./sw.js": 273,
	"./ta": 274,
	"./ta.js": 274,
	"./te": 275,
	"./te.js": 275,
	"./tet": 276,
	"./tet.js": 276,
	"./tg": 277,
	"./tg.js": 277,
	"./th": 278,
	"./th.js": 278,
	"./tl-ph": 279,
	"./tl-ph.js": 279,
	"./tlh": 280,
	"./tlh.js": 280,
	"./tr": 281,
	"./tr.js": 281,
	"./tzl": 282,
	"./tzl.js": 282,
	"./tzm": 283,
	"./tzm-latn": 284,
	"./tzm-latn.js": 284,
	"./tzm.js": 283,
	"./ug-cn": 285,
	"./ug-cn.js": 285,
	"./uk": 286,
	"./uk.js": 286,
	"./ur": 287,
	"./ur.js": 287,
	"./uz": 288,
	"./uz-latn": 289,
	"./uz-latn.js": 289,
	"./uz.js": 288,
	"./vi": 290,
	"./vi.js": 290,
	"./x-pseudo": 291,
	"./x-pseudo.js": 291,
	"./yo": 292,
	"./yo.js": 292,
	"./zh-cn": 293,
	"./zh-cn.js": 293,
	"./zh-hk": 294,
	"./zh-hk.js": 294,
	"./zh-tw": 295,
	"./zh-tw.js": 295
};
function webpackContext(req) {
	return __webpack_require__(webpackContextResolve(req));
};
function webpackContextResolve(req) {
	var id = map[req];
	if(!(id + 1)) // check for number or string
		throw new Error("Cannot find module '" + req + "'.");
	return id;
};
webpackContext.keys = function webpackContextKeys() {
	return Object.keys(map);
};
webpackContext.resolve = webpackContextResolve;
module.exports = webpackContext;
webpackContext.id = 417;

/***/ }),

/***/ 460:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MyApp; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(15);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__ionic_native_status_bar__ = __webpack_require__(338);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__ionic_native_splash_screen__ = __webpack_require__(335);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__providers_config_config__ = __webpack_require__(339);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__pages_home_home__ = __webpack_require__(90);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__pages_produto_produto__ = __webpack_require__(59);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__pages_login_login__ = __webpack_require__(89);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__pages_sobre_sobre__ = __webpack_require__(116);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__pages_intro_intro__ = __webpack_require__(115);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__pages_inventario_inventario__ = __webpack_require__(60);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__pages_recursos_humanos_recursos_humanos__ = __webpack_require__(61);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};












var MyApp = /** @class */ (function () {
    function MyApp(platform, statusBar, splashScreen, toastCtrl, configProvider) {
        var _this = this;
        var lastTimeBackPress = 0;
        var timePeriodToExit = 2000;
        this.pages = [
            { titulo: 'Inicio', component: __WEBPACK_IMPORTED_MODULE_5__pages_home_home__["a" /* HomePage */], icon: 'home' },
            { titulo: 'Produto', component: __WEBPACK_IMPORTED_MODULE_6__pages_produto_produto__["a" /* ProdutoPage */], icon: 'cart' },
            { titulo: 'Inventário', component: __WEBPACK_IMPORTED_MODULE_10__pages_inventario_inventario__["a" /* InventarioPage */], icon: 'archive' },
            { titulo: 'Recursos Humanos', component: __WEBPACK_IMPORTED_MODULE_11__pages_recursos_humanos_recursos_humanos__["a" /* RecursosHumanosPage */], icon: 'person' },
            { titulo: 'Sobre', component: __WEBPACK_IMPORTED_MODULE_8__pages_sobre_sobre__["a" /* SobrePage */], icon: 'information-circle' },
        ];
        platform.ready().then(function () {
            var config = configProvider.getConfigData();
            if (config == null) {
                _this.rootPage = __WEBPACK_IMPORTED_MODULE_9__pages_intro_intro__["a" /* IntroPage */];
                configProvider.setConfigData(false);
            }
            else {
                _this.rootPage = __WEBPACK_IMPORTED_MODULE_7__pages_login_login__["a" /* LoginPage */];
            }
            statusBar.styleDefault();
            splashScreen.hide();
        });
    }
    MyApp.prototype.goToPage = function (page) {
        this.nav.setRoot(page);
    };
    MyApp.prototype.logout = function () {
        this.goToPage(__WEBPACK_IMPORTED_MODULE_7__pages_login_login__["a" /* LoginPage */]);
    };
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_8" /* ViewChild */])('NAV'),
        __metadata("design:type", __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["g" /* Nav */])
    ], MyApp.prototype, "nav", void 0);
    MyApp = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["m" /* Component */])({template:/*ion-inline-start:"C:\Users\sett\Desktop\AdventureWorks\AdventureWorks\src\app\app.html"*/'<ion-menu [content]="NAV">\n        <ion-content style="background-color:white;">\n          <div class="fHamb">\n            <div><img class="ftHamb" src="assets/imgs/logoR.png" alt="Logo"></div>\n            <div class="tHamb"> Adventure Works</div>\n            <div class="pHamb"> Matriz | 41 3333 3333</div>\n          </div>\n          <img class="logoFoto" src="assets/imgs/obraprima_op.png" alt="Logo AdventureWorks">\n      \n          <ion-list>\n            <button ion-item *ngFor="let page of pages" (click)="goToPage(page.component)" menuClose>\n              <ion-icon item-left class="iconHamb" name="{{ page.icon }}"></ion-icon><span class="txtHamb">{{ page.titulo }}</span>\n            </button>\n          </ion-list>\n          <ion-footer>\n            <div style="margin-top:-25%; ">\n              <button class="hLogin" ion-button menuClose block icon-end color="cWhite" (click)="logout()">\n              <ion-thumbnail item-start style="margin-right:11%; float:left;">\n              <img src="assets/imgs/contact.png" style="height:30px; width:30px; float:left;">\n              </ion-thumbnail>\n              <p>Otávio Zanon<p>\n              <button ion-button color="cWhite" class="buttonSair">Sair</button>\n              </button>\n            </div>\n          </ion-footer>\n        </ion-content>\n      </ion-menu>\n      \n      <ion-nav #NAV [root]="rootPage"></ion-nav>'/*ion-inline-end:"C:\Users\sett\Desktop\AdventureWorks\AdventureWorks\src\app\app.html"*/,
            providers: [
                __WEBPACK_IMPORTED_MODULE_4__providers_config_config__["a" /* ConfigProvider */]
            ]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["j" /* Platform */],
            __WEBPACK_IMPORTED_MODULE_2__ionic_native_status_bar__["a" /* StatusBar */],
            __WEBPACK_IMPORTED_MODULE_3__ionic_native_splash_screen__["a" /* SplashScreen */],
            __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["k" /* ToastController */],
            __WEBPACK_IMPORTED_MODULE_4__providers_config_config__["a" /* ConfigProvider */]])
    ], MyApp);
    return MyApp;
}());

//# sourceMappingURL=app.component.js.map

/***/ }),

/***/ 59:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ProdutoPage; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(15);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_ionic_angular_components_alert_alert_controller__ = __webpack_require__(52);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



/**
 * Generated class for the ProdutoPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */
var ProdutoPage = /** @class */ (function () {
    function ProdutoPage(navCtrl, navParams, alertCtrl) {
        this.navCtrl = navCtrl;
        this.navParams = navParams;
        this.alertCtrl = alertCtrl;
    }
    ProdutoPage.prototype.ionViewDidLoad = function () {
        console.log('ionViewDidLoad ProdutoPage');
    };
    ProdutoPage.prototype.showCheckbox = function () {
        var _this = this;
        var alert = this.alertCtrl.create();
        alert.setTitle('Filtrar por:');
        alert.addInput({
            type: 'checkbox',
            label: 'Moutain Bike',
            value: 'value1'
        });
        alert.addInput({
            type: 'checkbox',
            label: 'Urbana',
            value: 'value2'
        });
        alert.addInput({
            type: 'checkbox',
            label: 'Fixa',
            value: 'value3'
        });
        alert.addInput({
            type: 'checkbox',
            label: 'Speed',
            value: 'value4'
        });
        alert.addButton('Cancelar');
        alert.addButton({
            text: 'Filtrar',
            handler: function (data) {
                _this.testCheckboxOpen = false;
                _this.testCheckboxResult = data;
            }
        });
        alert.present().then(function () {
            _this.testCheckboxOpen = true;
        });
    };
    ProdutoPage = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["m" /* Component */])({
            selector: 'page-produto',template:/*ion-inline-start:"C:\Users\sett\Desktop\AdventureWorks\AdventureWorks\src\pages\produto\produto.html"*/'<ion-header>\n  <ion-navbar color="cNav">\n    <button ion-button icon-only menuToggle>\n      <ion-icon name="menu"></ion-icon>\n    </button>\n    <!-- Title -->\n    <ion-title>Produtos</ion-title>\n    <ion-buttons end (click)="showCheckbox()">\n      <button ion-button icon-only>\n        <ion-icon name="funnel"></ion-icon>\n      </button>\n    </ion-buttons>\n  </ion-navbar>\n</ion-header>\n\n\n<ion-content>\n  <ion-list>\n    <ion-item>\n      <h2>BikeBilenky</h2>\n      <p>Categoria: Mountain Bike</p>\n      <ion-badge color="cotada" item-end>06</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>Basso</h2>\n      <p>Categoria: Urbana</p>\n      <ion-badge color="cotada" item-end>12</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>Adler</h2>\n      <p>Categoria: Urbana</p>\n      <ion-badge color="cotada" item-end>03</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>BerlinBH</h2>\n      <p>Categoria: Urbana</p>\n      <ion-badge color="cotada" item-end>07</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>BMC</h2>\n      <p>Categoria: Fixa</p>\n      <ion-badge color="cotada" item-end>05</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>Bootie</h2>\n      <p>Categoria: Fixa</p>\n      <ion-badge color="cotada" item-end>08</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>Bottecchia</h2>\n      <p>Categoria: Speed</p>\n      <ion-badge color="cotada" item-end>16</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>Author</h2>\n      <p>Categoria: Urbana</p>\n      <ion-badge color="cotada" item-end>11</ion-badge>\n    </ion-item>\n    <ion-item>\n      <h2>Birdy</h2>\n      <p>Categoria: Speed</p>\n      <ion-badge color="cotada" item-end>09</ion-badge>\n    </ion-item>\n  </ion-list>\n\n</ion-content>'/*ion-inline-end:"C:\Users\sett\Desktop\AdventureWorks\AdventureWorks\src\pages\produto\produto.html"*/,
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["h" /* NavController */],
            __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["i" /* NavParams */],
            __WEBPACK_IMPORTED_MODULE_2_ionic_angular_components_alert_alert_controller__["a" /* AlertController */]])
    ], ProdutoPage);
    return ProdutoPage;
}());

//# sourceMappingURL=produto.js.map

/***/ }),

/***/ 60:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return InventarioPage; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(15);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_chart_js__ = __webpack_require__(389);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_chart_js___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_chart_js__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__estoque_estoque__ = __webpack_require__(114);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





/**
 * Generated class for the InventarioPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */
var InventarioPage = /** @class */ (function () {
    function InventarioPage(navCtrl, navParams) {
        this.navCtrl = navCtrl;
        this.navParams = navParams;
    }
    InventarioPage.prototype.ngAfterViewInit = function () {
        var _this = this;
        setTimeout(function () {
            _this.lineChart = _this.getLineChart();
        }, 150);
        setTimeout(function () {
            _this.pieChart = _this.getPieChart();
        }, 250);
    };
    InventarioPage.prototype.getChart = function (context, chartType, data, options) {
        return new __WEBPACK_IMPORTED_MODULE_2_chart_js___default.a(context, {
            data: data,
            options: options,
            type: chartType
        });
    };
    InventarioPage.prototype.getLineChart = function () {
        var data = {
            labels: ['Janeiro', 'Fevereiro', 'Março', 'Abril'],
            datasets: [{
                    label: 'Pedidos',
                    fill: false,
                    lineTension: 0.1,
                    backgroundColor: 'rgb(231, 205, 35)',
                    borderColor: 'rgb(231, 205, 35)',
                    borderCapStyle: 'butt',
                    borderJoinStyle: 'miter',
                    pointRadius: 1,
                    pointHitRadius: 10,
                    data: [20, 15, 98, 4],
                    scanGaps: false,
                }, {
                    label: 'Produtos',
                    fill: false,
                    lineTension: 0.1,
                    backgroundColor: 'rgb(51, 50, 46)',
                    borderColor: 'rgb(51, 50, 46)',
                    borderCapStyle: 'butt',
                    borderJoinStyle: 'miter',
                    pointRadius: 1,
                    pointHitRadius: 10,
                    data: [29, 135, 13, 70],
                    scanGaps: false,
                }
            ]
        };
        return this.getChart(this.lineCanvas.nativeElement, 'line', data);
    };
    InventarioPage.prototype.getPieChart = function () {
        var data = {
            labels: ['Desvalorizado', 'Valorizado'],
            datasets: [{
                    data: [211, 638],
                    backgroundColor: ['rgb(231,205,35)', 'rgb(51,50,46)']
                }]
        };
        return this.getChart(this.pieCanvas.nativeElement, 'pie', data);
    };
    InventarioPage.prototype.ionViewDidLoad = function () {
        console.log('ionViewDidLoad InventarioPage');
    };
    InventarioPage.prototype.TodosProdutos = function () {
        this.navCtrl.push(__WEBPACK_IMPORTED_MODULE_3__estoque_estoque__["a" /* EstoquePage */]);
    };
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_8" /* ViewChild */])('lineCanvas'),
        __metadata("design:type", Object)
    ], InventarioPage.prototype, "lineCanvas", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_8" /* ViewChild */])('pieCanvas'),
        __metadata("design:type", Object)
    ], InventarioPage.prototype, "pieCanvas", void 0);
    InventarioPage = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["m" /* Component */])({
            selector: 'page-inventario',template:/*ion-inline-start:"C:\Users\sett\Desktop\AdventureWorks\AdventureWorks\src\pages\inventario\inventario.html"*/'<ion-header>\n    <ion-navbar color="cNav">\n      <button ion-button icon-only menuToggle>\n        <ion-icon name="menu"></ion-icon>\n      </button>\n      <!-- Title -->\n      <ion-title>Inventário</ion-title>\n    </ion-navbar>\n  </ion-header>\n  \n  <ion-content>\n    <ion-card>\n      <ion-card-header>\n        Vendas\n      </ion-card-header>\n      <ion-card-content>\n        <canvas #lineCanvas></canvas>\n      </ion-card-content>\n    </ion-card>\n    <ion-card>\n      <ion-card-header>\n        Estoque\n      </ion-card-header>\n      <ion-card-content>\n        <canvas #pieCanvas></canvas>\n      </ion-card-content>\n    </ion-card>\n    <div class="buttonLogin" padding>\n      <button ion-button block color="buttonLogin" (click)="TodosProdutos()" style="height:40px;">Todos Produtos</button>\n    </div>\n  \n  </ion-content>\n  '/*ion-inline-end:"C:\Users\sett\Desktop\AdventureWorks\AdventureWorks\src\pages\inventario\inventario.html"*/,
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["h" /* NavController */], __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["i" /* NavParams */]])
    ], InventarioPage);
    return InventarioPage;
}());

//# sourceMappingURL=inventario.js.map

/***/ }),

/***/ 61:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return RecursosHumanosPage; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(15);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__detalhe_pessoa_detalhe_pessoa__ = __webpack_require__(113);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



/**
 * Generated class for the RecursosHumanosPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */
var RecursosHumanosPage = /** @class */ (function () {
    function RecursosHumanosPage(navCtrl, navParams) {
        this.navCtrl = navCtrl;
        this.navParams = navParams;
    }
    RecursosHumanosPage.prototype.ionViewDidLoad = function () {
        console.log('ionViewDidLoad RecursosHumanosPage');
    };
    RecursosHumanosPage.prototype.irDetalhe = function () {
        this.navCtrl.push(__WEBPACK_IMPORTED_MODULE_2__detalhe_pessoa_detalhe_pessoa__["a" /* DetalhePessoaPage */]);
    };
    RecursosHumanosPage = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["m" /* Component */])({
            selector: 'page-recursos-humanos',template:/*ion-inline-start:"C:\Users\sett\Desktop\AdventureWorks\AdventureWorks\src\pages\recursos-humanos\recursos-humanos.html"*/'<ion-header>\n  <ion-navbar color="cNav">\n    <button ion-button icon-only menuToggle>\n      <ion-icon name="menu"></ion-icon>\n    </button>\n    <!-- Title -->\n    <ion-title>Recursos Humanos</ion-title>\n  </ion-navbar>\n</ion-header>\n\n\n<ion-content >\n\n    <ion-item-group>\n      <ion-item-divider color="light">Empregados</ion-item-divider>\n      <ion-item (click)="irDetalhe()">Marty McFly</ion-item>\n      <ion-item>Emmett Brown</ion-item>\n      <ion-item>Jennifer Parker</ion-item>\n    </ion-item-group>\n    <ion-item-group>\n      <ion-item-divider color="light">Candidatos</ion-item-divider>\n      <ion-item>Linda McFly</ion-item>\n      <ion-item>Biff Tannen</ion-item>\n      <ion-item>George McFly</ion-item>\n    </ion-item-group>\n</ion-content>'/*ion-inline-end:"C:\Users\sett\Desktop\AdventureWorks\AdventureWorks\src\pages\recursos-humanos\recursos-humanos.html"*/,
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["h" /* NavController */], __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["i" /* NavParams */]])
    ], RecursosHumanosPage);
    return RecursosHumanosPage;
}());

//# sourceMappingURL=recursos-humanos.js.map

/***/ }),

/***/ 89:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return LoginPage; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(15);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__home_home__ = __webpack_require__(90);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




/**
 * Generated class for the LoginPage page.
 *
 * See http://ionicframework.com/docs/components/#navigation for more info
 * on Ionic pages and navigation.
 */
var LoginPage = /** @class */ (function () {
    function LoginPage(navCtrl, navParams, menuCtrl, toastCtrl) {
        this.navCtrl = navCtrl;
        this.navParams = navParams;
        this.menuCtrl = menuCtrl;
        this.toastCtrl = toastCtrl;
        this.searchTerm = '';
        this.data = [];
        this.toggled = false;
        this.menuCtrl.enable(false);
    }
    LoginPage.prototype.login = function () {
        var usuario = this.data['username'];
        var senha = this.data['password'];
        this.logar(usuario, senha);
    };
    LoginPage.prototype.logar = function (usuario, senha) {
        if (usuario = this.data['username'] == "admin", senha = this.data['password'] == "admin") {
            this.navCtrl.setRoot(__WEBPACK_IMPORTED_MODULE_2__home_home__["a" /* HomePage */]);
            console.log("Deu boa");
        }
        else {
            var toast = this.toastCtrl.create({
                message: 'Usuario e/ou senha incorreta.',
                duration: 3000,
                position: 'bottom',
                cssClass: "cssToast",
            });
            toast.present();
        }
    };
    LoginPage.prototype.entrar = function () {
        this.navCtrl.setRoot(__WEBPACK_IMPORTED_MODULE_2__home_home__["a" /* HomePage */]);
    };
    LoginPage.prototype.ionViewDidLoad = function () {
    };
    LoginPage.prototype.toggleSearch = function () {
        this.toggled = this.toggled ? false : true;
    };
    LoginPage = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["m" /* Component */])({
            selector: 'page-login',template:/*ion-inline-start:"C:\Users\sett\Desktop\AdventureWorks\AdventureWorks\src\pages\login\login.html"*/'<!--\n  Generated template for the LoginPage page.\n\n  See http://ionicframework.com/docs/components/#navigation for more info on\n  Ionic pages and navigation.\n-->\n\n<ion-content fixed class="pane" scroll="false" style="height:100%;">\n  <div class="formLogin" scroll="false" style="position:fixed;">\n    <form style="margin-top:3%;">\n      <ion-item color="primary">\n        <ion-label floating color="light" style="font-size:14px;">Username</ion-label>\n        <ion-input color="primary" type="email" [(ngModel)]="data.username" name="username"></ion-input>\n      </ion-item>\n      <ion-item color="primary">\n        <ion-label floating color="light" style="font-size:14px;">Senha</ion-label>\n        <ion-input color="primary" type="password" name="password" [(ngModel)]="data.password"></ion-input>\n      </ion-item>\n    </form>\n    <div class="buttonLogin">\n      <button ion-button block color="buttonLogin" (click)="login()" style="height:40px;">ACESSAR</button>\n      <a href="#" class="linkSenha" style="float:right; margin-top:10px;" onclick="window.open(\'\', \'_system\', \'location=yes\');">Esqueci a senha</a>\n    </div>\n  </div>\n  <!-- <footer text-center style="position: fixed; bottom: 0; padding: 5px; background:#f8f8f8; width:100%;">\n    <ion-toolbar (click)="cadastrarUsuario()">\n      <a class="fLink">NÃO É CADASTRADO? EXPERIMENTE GRATUITAMENTE</a>\n    </ion-toolbar>\n  </footer> -->\n</ion-content>'/*ion-inline-end:"C:\Users\sett\Desktop\AdventureWorks\AdventureWorks\src\pages\login\login.html"*/,
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["h" /* NavController */],
            __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["i" /* NavParams */],
            __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["f" /* MenuController */],
            __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["k" /* ToastController */]])
    ], LoginPage);
    return LoginPage;
}());

//# sourceMappingURL=login.js.map

/***/ }),

/***/ 90:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HomePage; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(15);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__produto_produto__ = __webpack_require__(59);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__inventario_inventario__ = __webpack_require__(60);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__recursos_humanos_recursos_humanos__ = __webpack_require__(61);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};






var HomePage = /** @class */ (function () {
    function HomePage(navCtrl, navParams, loadingCtrl, toastCtrl, menuCtrl) {
        this.navCtrl = navCtrl;
        this.navParams = navParams;
        this.loadingCtrl = loadingCtrl;
        this.toastCtrl = toastCtrl;
        this.menuCtrl = menuCtrl;
        this.showSearchbar = false;
        this.menuCtrl.enable(true);
    }
    HomePage.prototype.ionViewDidLoad = function () {
        console.log('Pagina obras carregada.');
    };
    HomePage.prototype.openFilters = function () {
        console.log('crap');
    };
    HomePage.prototype.toggleSearchbar = function () {
        this.showSearchbar = !this.showSearchbar;
    };
    HomePage.prototype.irProduto = function () {
        this.navCtrl.setRoot(__WEBPACK_IMPORTED_MODULE_2__produto_produto__["a" /* ProdutoPage */]);
    };
    HomePage.prototype.irInventario = function () {
        this.navCtrl.setRoot(__WEBPACK_IMPORTED_MODULE_3__inventario_inventario__["a" /* InventarioPage */]);
    };
    HomePage.prototype.irRecursosHumanos = function () {
        this.navCtrl.setRoot(__WEBPACK_IMPORTED_MODULE_4__recursos_humanos_recursos_humanos__["a" /* RecursosHumanosPage */]);
    };
    HomePage = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["m" /* Component */])({
            selector: 'page-home',template:/*ion-inline-start:"C:\Users\sett\Desktop\AdventureWorks\AdventureWorks\src\pages\home\home.html"*/'<ion-header>\n  <ion-navbar color="cNav">\n    <button *ngIf="!showSearchbar" ion-button icon-only menuToggle>\n      <ion-icon name="menu"></ion-icon>\n    </button>\n    <!-- Title -->\n    <ion-title *ngIf="!showSearchbar">Módulos</ion-title>\n\n    <ion-buttons end>\n      <button ion-button icon-only (click)="toggleSearchbar()">\n        <ion-icon name="search"></ion-icon>\n      </button>\n    </ion-buttons>\n    <ion-toolbar *ngIf="showSearchbar">\n      <ion-searchbar placeholder="Pesquisar"></ion-searchbar>\n    </ion-toolbar>\n  </ion-navbar>\n</ion-header>\n\n\n<ion-content class="card-background-page">\n  <button (click)="irProduto()" style="background-color:#f6f6f6;">\n    <ion-card>\n      <img src="assets/imgs/card-saopaolo.png" />\n      <div class="card-title">Produto</div>\n      <div class="card-subtitle">\n        Adventure Works\n        <br/> Curitiba-PR\n        <br/>\n      </div>\n    </ion-card>\n  </button>\n  <button (click)="irInventario()" style="background-color:#f6f6f6;">\n    <ion-card>\n      <img src="assets/imgs/card-madison.png" />\n      <div class="card-title">Inventário</div>\n      <div class="card-subtitle">\n        Adventure Works\n        <br/> Curitiba-PR\n        <br/>\n      </div>\n    </ion-card>\n  </button>\n  <button (click)="irRecursosHumanos()" style="background-color:#f6f6f6;">\n    <ion-card>\n      <img src="assets/imgs/card-saopaolo.png" />\n      <div class="card-title">Recursos Humanos</div>\n      <div class="card-subtitle">\n        Adventure Works\n        <br/> Curitiba-PR\n        <br/>\n      </div>\n    </ion-card>\n  </button>\n</ion-content>'/*ion-inline-end:"C:\Users\sett\Desktop\AdventureWorks\AdventureWorks\src\pages\home\home.html"*/
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["h" /* NavController */],
            __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["i" /* NavParams */],
            __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["e" /* LoadingController */],
            __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["k" /* ToastController */],
            __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["f" /* MenuController */]])
    ], HomePage);
    return HomePage;
}());

//# sourceMappingURL=home.js.map

/***/ })

},[340]);
//# sourceMappingURL=main.js.map