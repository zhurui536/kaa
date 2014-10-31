/*
 * Copyright 2014 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#ifndef PINGCONNECTIVITYCHECKER_HPP_
#define PINGCONNECTIVITYCHECKER_HPP_

#include "kaa/KaaDefaults.hpp"

#ifdef KAA_DEFAULT_CONNECTIVITY_CHECKER

#include "kaa/channel/connectivity/IConnectivityChecker.hpp"

namespace kaa {

class IPingServerStorage;

/**
 * Reference implementation of @link IConnectivityChecker @endlink.
 *
 * Use simple ping mechanism of some pattern server.
 */
class PingConnectivityChecker: public IConnectivityChecker {
public:
    PingConnectivityChecker(IPingServerStorage& storage)
        : serverStorage_(storage) {}

    virtual bool checkConnectivity();
private:
    IPingServerStorage& serverStorage_;
};

} /* namespace kaa */

#endif

#endif /* PINGCONNECTIVITYCHECKER_HPP_ */
